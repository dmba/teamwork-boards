package me.dmba.teamworkboards.screens.boards.column

import android.support.v7.widget.RecyclerView.RecycledViewPool
import android.view.LayoutInflater
import android.view.View
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import com.woxthebox.draglistview.BoardView
import kotlinx.android.synthetic.main.column_header.view.*
import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.data.model.entity.Column
import me.dmba.teamworkboards.screens.boards.adapter.ColumnAdapter

/**
 * Created by dmba on 7/18/18.
 */
class ColumnProviderDefault @AssistedInject constructor(

    private val inflater: LayoutInflater,

    private val adapter: ColumnAdapter,

    private val sharedRecycledViewPool: RecycledViewPool,

    @Assisted private val boardView: BoardView

) : ColumnProvider {

    @AssistedInject.Factory
    interface Factory : ColumnProviderFactory {
        override fun create(boardView: BoardView): ColumnProviderDefault
    }

    var createdItems = 0

    override fun addColumn(column: Column): ColumnAdapter {
        val header: View = createHeader(column)

        boardView.addColumn(adapter, header, header, false)
            .apply {
                recycledViewPool = sharedRecycledViewPool
            }

        adapter.onDataSetChanged.subscribe {
            header.item_count.text = adapter.itemCount.toString()
        }

        return adapter
    }

    private fun createHeader(column: Column): View {
        return inflater.inflate(R.layout.column_header, boardView, false).apply {
            text.text = column.name
            item_count.text = adapter.itemCount.toString()
            setOnClickListener(::onHeaderClickListener)
        }
    }

    private fun onHeaderClickListener(view: View) {
        view.item_count.text = adapter.itemCount.toString()
        val id = createdItems++
        val item = Card(id.toString(), "Test $id", false)
        boardView.addItem(boardView.getColumnOfHeader(view), 0, item, true)
    }

}
