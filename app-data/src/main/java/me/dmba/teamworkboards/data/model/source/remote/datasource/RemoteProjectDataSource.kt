package me.dmba.teamworkboards.data.model.source.remote.datasource

import io.reactivex.Flowable
import me.dmba.teamworkboards.data.model.access.ProjectRepo
import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.data.model.entity.Column
import me.dmba.teamworkboards.data.model.entity.Project
import me.dmba.teamworkboards.data.model.source.remote.api.ProjectService
import java.util.*
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class RemoteProjectDataSource @Inject constructor(

    private val projectService: ProjectService

) : ProjectRepo {

    override fun getProject(): Flowable<Project> {
        return projectService.getProjects()
            .flatMapIterable { it.projects }
            .map {
                Project(
                    id = it.id,
                    name = it.name
                )
            }
            .take(1)
    }

    override fun getColumns(projectId: String): Flowable<List<Column>> {
        return projectService.getProjectColumns(projectId)
            .flatMapIterable { it.columns }
            .map {
                Column(
                    id = it.id,
                    name = it.name,
                    order = it.displayOrder.toInt()
                )
            }
            .toSortedList { o1, o2 -> o1.order.compareTo(o2.order) }
            .toFlowable()
            .map {
                it.sortWith(Comparator { o1, o2 ->
                    o1.order.compareTo(o2.order)
                })
                it
            }
    }

    override fun getCardsForColumn(columnId: String): Flowable<List<Card>> {
        return projectService.getCardsForColumn(columnId)
            .flatMapIterable { it.cards }
            .map {
                Card(
                    id = it.id,
                    name = it.name,
                    hasAttachments = (it.numAttachments.toInt() > 0)
                )
            }
            .toList()
            .toFlowable()
    }

}
