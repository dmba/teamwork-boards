package me.dmba.teamworkboards.data.model.source.remote.provider

/**
 * Created by dmba on 7/16/18.
 */
internal interface TeamworkUrlProvider {

    val loginRedirectUrl: String

    val apiUrl: String

    val loginUrl: String

}
