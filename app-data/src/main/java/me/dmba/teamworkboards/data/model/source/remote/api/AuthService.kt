package me.dmba.teamworkboards.data.model.source.remote.api

import io.reactivex.Single
import me.dmba.teamworkboards.data.model.source.remote.model.TokenRequest
import me.dmba.teamworkboards.data.model.source.remote.model.TokenResponse
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by dmba on 7/16/18.
 */
interface AuthService {

    @POST("/launchpad/v1/token.json")
    fun authenticate(@Body payload: TokenRequest): Single<TokenResponse>

}
