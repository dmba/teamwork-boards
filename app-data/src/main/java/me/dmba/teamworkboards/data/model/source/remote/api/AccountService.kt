package me.dmba.teamworkboards.data.model.source.remote.api

import io.reactivex.Single
import me.dmba.teamworkboards.data.model.source.remote.model.AccountResponse
import retrofit2.http.GET

/**
 * Created by dmba on 7/16/18.
 */
internal interface AccountService {

    @GET("/account.json")
    fun getAccount(): Single<AccountResponse>

}
