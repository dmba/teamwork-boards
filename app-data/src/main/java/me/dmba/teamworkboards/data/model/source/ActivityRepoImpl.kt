package me.dmba.teamworkboards.data.model.source

import me.dmba.teamworkboards.data.model.access.ActivityRepo
import me.dmba.teamworkboards.data.model.source.local.datasource.LocalActivityDataSource
import me.dmba.teamworkboards.data.model.source.remote.datasource.RemoteActivityDataSource
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class ActivityRepoImpl @Inject constructor(
    val local: LocalActivityDataSource,
    val remote: RemoteActivityDataSource
) : ActivityRepo by remote
