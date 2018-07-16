package me.dmba.teamworkboards.data.model.source

import me.dmba.teamworkboards.data.model.access.TaskRepo
import me.dmba.teamworkboards.data.model.source.local.datasource.LocalTaskDataSource
import me.dmba.teamworkboards.data.model.source.remote.datasource.RemoteTaskDataSource
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class TaskRepoImpl @Inject constructor(
    val local: LocalTaskDataSource,
    val remote: RemoteTaskDataSource
) : TaskRepo by remote
