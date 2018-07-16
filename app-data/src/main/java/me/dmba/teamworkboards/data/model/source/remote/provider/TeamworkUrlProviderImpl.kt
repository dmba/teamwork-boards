package me.dmba.teamworkboards.data.model.source.remote.provider

import android.content.Context
import me.dmba.teamworkboards.data.R
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class TeamworkUrlProviderImpl @Inject constructor(

    private val context: Context

) : TeamworkUrlProvider {

    override val apiUrl: String
        get() = context.getString(R.string.app_teamwork_url)

    override val loginRedirectUrl: String
        get() = context.getString(R.string.app_login_redirect_url)

    override val loginUrl: String
        get() = context.getString(R.string.app_teamwork_login_url, apiUrl, loginRedirectUrl)

}
