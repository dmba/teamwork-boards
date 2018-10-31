package me.dmba.teamworkboards.domain.impl

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import me.dmba.teamworkboards.common.extensions.addTo
import me.dmba.teamworkboards.data.model.access.ProjectRepo
import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.data.model.entity.Column
import me.dmba.teamworkboards.data.model.entity.Project
import me.dmba.teamworkboards.domain.base.DisposablePresenter
import me.dmba.teamworkboards.domain.contract.BoardsContract
import javax.inject.Inject

/**
 * Created by dmba on 7/17/18.
 */
internal class BoardsPresenter @Inject constructor(

    private val view: BoardsContract.View,

    private val navigator: BoardsContract.Navigator,

    private val projectRepo: ProjectRepo

) : DisposablePresenter(), BoardsContract.Presenter {

    override fun onStart() {
        projectRepo.getProject()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(::onNextProject, ::onError)
            .addTo(disposables)
    }

    override fun onRefreshColumnCards(column: Column) {
        projectRepo.getCardsForColumn(column.id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(onNextFetchColumnCards(column), ::onError)
            .addTo(disposables)
    }

    override fun onCardClick(card: Card) {
        navigator.goToCardDetails(card)
    }

    private fun onNextProject(project: Project) {
        projectRepo.getColumns(project.id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(view::showColumns, ::onError)
            .addTo(disposables)
    }

    private fun onNextFetchColumnCards(column: Column): (List<Card>) -> Unit = { cards ->
        view.updateCardsForColumn(column, cards)
    }

    private fun onError(throwable: Throwable) {
        view.showDataFetchError()
    }

}
