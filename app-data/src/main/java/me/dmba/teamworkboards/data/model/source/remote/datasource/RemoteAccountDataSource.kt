package me.dmba.teamworkboards.data.model.source.remote.datasource

import io.reactivex.Single
import me.dmba.teamworkboards.data.model.access.AccountRepo
import me.dmba.teamworkboards.data.model.entity.Account
import me.dmba.teamworkboards.data.model.source.remote.api.AccountService
import me.dmba.teamworkboards.data.model.source.remote.model.mappers.mapResponseToAccount
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class RemoteAccountDataSource @Inject constructor(

    private val accountService: AccountService

) : AccountRepo {

    override fun getAccountDetails(): Single<Account> {
        return accountService.getAccount()
            .map(::mapResponseToAccount)
    }

}
