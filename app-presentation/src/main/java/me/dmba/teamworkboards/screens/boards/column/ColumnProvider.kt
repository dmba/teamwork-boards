package me.dmba.teamworkboards.screens.boards.column

import me.dmba.teamworkboards.data.model.entity.Column
import me.dmba.teamworkboards.screens.boards.adapter.ColumnAdapter

interface ColumnProvider {

    fun addColumn(column: Column): ColumnAdapter

}
