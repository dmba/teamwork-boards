package me.dmba.teamworkboards.data.model.source.local.datasource

import io.reactivex.Flowable
import me.dmba.teamworkboards.data.model.access.ProjectRepo
import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.data.model.entity.Column
import me.dmba.teamworkboards.data.model.entity.Project
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class LocalProjectDataSource @Inject constructor() : ProjectRepo {
    override fun getCardsForColumn(columnId: String): Flowable<List<Card>> {
        TODO("not implemented")
    }

    override fun getProject(): Flowable<Project> {
        TODO("not implemented")
    }

    override fun getColumns(projectId: String): Flowable<List<Column>> {
        TODO("not implemented")
    }
}
