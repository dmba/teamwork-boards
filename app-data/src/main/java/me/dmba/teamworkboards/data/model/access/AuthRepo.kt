package me.dmba.teamworkboards.data.model.access

import io.reactivex.Completable

/**
 * Created by dmba on 7/16/18.
 */
interface AuthRepo {

    val loginRedirectUrl: String

    val loginUrl: String

    val hasApiToken: Boolean

    val hasApiEndpoint: Boolean

    var apiToken: String

    val apiEndpoint: String

    fun authenticate(code: String): Completable

}
