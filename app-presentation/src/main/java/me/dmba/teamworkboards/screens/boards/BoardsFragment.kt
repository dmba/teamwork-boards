package me.dmba.teamworkboards.screens.boards

import android.os.Bundle
import android.view.View
import com.woxthebox.draglistview.BoardView.ColumnSnapPosition
import kotlinx.android.synthetic.main.fragment_boards.*
import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.common.extensions.addTo
import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.data.model.entity.Column
import me.dmba.teamworkboards.domain.contract.BoardsContract
import me.dmba.teamworkboards.screens.base.BaseFragment
import me.dmba.teamworkboards.screens.boards.adapter.ColumnAdapter
import me.dmba.teamworkboards.screens.boards.column.ColumnProviderFactory
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by dmba on 7/17/18.
 */
class BoardsFragment : BaseFragment<BoardsContract.Presenter>(R.layout.fragment_boards), BoardsContract.View {

    @Inject
    lateinit var columnProviderFactory: ColumnProviderFactory

    private val adapters = mutableMapOf<String, ColumnAdapter>()

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupBoard()
    }

    override fun showColumns(columns: List<Column>) {
        columns.forEach(::addColumn)
    }

    override fun updateCardsForColumn(column: Column, cards: List<Card>) {
        adapters[column.id]?.updateCards(cards)
    }

    override fun showDataFetchError() {
        context.toast(R.string.app_something_went_wrong)
    }

    private fun addColumn(column: Column) {
        columnProviderFactory.create(boardView)
            .addColumn(column)
            .apply { adapters[column.id] = this }
            .apply { onItemClick.subscribe(presenter::onCardClick).addTo(disposables) }

        presenter.onRefreshColumnCards(column)
    }

    private fun setupBoard() = boardView.apply {
        setSnapToColumnsWhenScrolling(true)
        setSnapToColumnWhenDragging(true)
        setSnapDragItemToTouch(true)
        setSnapToColumnInLandscape(false)
        setColumnSnapPosition(ColumnSnapPosition.CENTER)
    }

}
