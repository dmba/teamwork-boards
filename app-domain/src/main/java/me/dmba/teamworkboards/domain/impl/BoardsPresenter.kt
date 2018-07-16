package me.dmba.teamworkboards.domain.impl

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import me.dmba.teamworkboards.common.extensions.addTo
import me.dmba.teamworkboards.data.model.access.AccountRepo
import me.dmba.teamworkboards.data.model.entity.Account
import me.dmba.teamworkboards.domain.base.DisposablePresenter
import me.dmba.teamworkboards.domain.contract.BoardsContract
import javax.inject.Inject

/**
 * Created by dmba on 7/17/18.
 */
internal class BoardsPresenter @Inject constructor(

    private val view: BoardsContract.View,

    private val navigator: BoardsContract.Navigator,

    private val accountRepo: AccountRepo

) : DisposablePresenter(), BoardsContract.Presenter {

    override fun onViewCreated() {
        accountRepo.getAccountDetails()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(::onSuccess, ::onError)
            .addTo(disposables)
    }

    private fun onSuccess(account: Account) {
        view.showGreetingTo(account.user)
    }

    private fun onError(throwable: Throwable) {
        view.showDataFetchError()
    }

}
