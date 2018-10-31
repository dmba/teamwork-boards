package me.dmba.teamworkboards.data.model.access

import io.reactivex.Flowable
import io.reactivex.Single
import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.data.model.entity.Column
import me.dmba.teamworkboards.data.model.entity.Project

/**
 * Created by dmba on 7/16/18.
 */
interface ProjectRepo {

    fun getColumns(projectId: String): Flowable<List<Column>>

    fun getCardsForColumn(columnId: String): Flowable<List<Card>>

    fun getProject(): Flowable<Project>
}
