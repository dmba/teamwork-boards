package me.dmba.teamworkboards.data.model.source

import me.dmba.teamworkboards.data.model.access.ProjectRepo
import me.dmba.teamworkboards.data.model.source.local.datasource.LocalProjectDataSource
import me.dmba.teamworkboards.data.model.source.remote.datasource.RemoteProjectDataSource
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class ProjectRepoImpl @Inject constructor(
    val local: LocalProjectDataSource,
    val remote: RemoteProjectDataSource
) : ProjectRepo by remote
