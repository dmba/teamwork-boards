package me.dmba.teamworkboards.data.model.source

import io.reactivex.Completable
import me.dmba.teamworkboards.common.utils.EMPTY
import me.dmba.teamworkboards.data.di.KeyValuePrefs
import me.dmba.teamworkboards.data.keyvalue.KeyValue
import me.dmba.teamworkboards.data.model.access.AuthRepo
import me.dmba.teamworkboards.data.model.source.remote.api.AuthenticationService
import me.dmba.teamworkboards.data.model.source.remote.model.TokenRequest
import me.dmba.teamworkboards.data.model.source.remote.model.TokenResponse
import me.dmba.teamworkboards.data.model.source.remote.provider.TeamworkUrlProvider
import me.dmba.teamworkboards.data.util.API_ENDPOINT
import me.dmba.teamworkboards.data.util.API_TOKEN
import me.dmba.teamworkboards.data.util.KeyValueDelegate
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class AuthRepoImpl @Inject constructor(

    urlProvider: TeamworkUrlProvider,

    private val authenticationService: AuthenticationService,

    @KeyValuePrefs private val keyValue: KeyValue

) : AuthRepo {

    override val loginRedirectUrl: String = urlProvider.loginRedirectUrl

    override val loginUrl: String = urlProvider.loginUrl

    override val hasApiToken: Boolean = keyValue.contains(API_TOKEN)

    override val hasApiEndpoint: Boolean = keyValue.contains(API_ENDPOINT)

    override var apiToken: String by KeyValueDelegate(keyValue, API_TOKEN)

    override var apiEndpoint: String by KeyValueDelegate(keyValue, API_ENDPOINT)

    override fun authenticate(code: String): Completable {
        return authenticationService.authenticate(TokenRequest(code))
            .doOnSuccess { this.handleSuccess(it) }
            .doOnError { this.handleError(it) }
            .toCompletable()
    }

    private fun handleSuccess(response: TokenResponse?) = response?.apply {
        apiToken = accessToken
        apiEndpoint = installation.apiEndPoint
    }

    private fun handleError(throwable: Throwable) {
        apiToken = EMPTY
        apiEndpoint = EMPTY
    }

}
