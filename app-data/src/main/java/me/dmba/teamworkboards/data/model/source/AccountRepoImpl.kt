package me.dmba.teamworkboards.data.model.source

import me.dmba.teamworkboards.data.model.access.AccountRepo
import me.dmba.teamworkboards.data.model.source.local.datasource.LocalAccountDataSource
import me.dmba.teamworkboards.data.model.source.remote.datasource.RemoteAccountDataSource
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class AccountRepoImpl @Inject constructor(
    val local: LocalAccountDataSource,
    val remote: RemoteAccountDataSource
) : AccountRepo by remote
