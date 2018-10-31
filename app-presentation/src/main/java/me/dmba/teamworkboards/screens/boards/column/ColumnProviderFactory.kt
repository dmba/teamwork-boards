package me.dmba.teamworkboards.screens.boards.column

import com.woxthebox.draglistview.BoardView

/**
 * Created by dmba on 7/18/18.
 */
interface ColumnProviderFactory {

    fun create(boardView: BoardView): ColumnProvider

}
