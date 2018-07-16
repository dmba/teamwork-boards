package me.dmba.teamworkboards.data.model.source.local.datasource

import io.reactivex.Single
import me.dmba.teamworkboards.data.model.access.AccountRepo
import me.dmba.teamworkboards.data.model.entity.Account
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class LocalAccountDataSource @Inject constructor() : AccountRepo {
    override fun getAccountDetails(): Single<Account> {
        TODO("not implemented")
    }
}
