package me.dmba.teamworkboards.data.model.source.remote.interceptors

import android.net.Uri
import me.dmba.teamworkboards.data.model.access.AuthRepo
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class TeamWorkEndpointInterceptor @Inject constructor(

    private val repo: AuthRepo

) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()

        if (repo.hasApiEndpoint) {
            val dynamicUrl = Uri.parse(repo.apiEndpoint)

            val newUrl = request.url().newBuilder()
                .scheme(dynamicUrl.scheme)
                .host(dynamicUrl.host)
                .build()

            request = request.newBuilder()
                .url(newUrl)
                .build()
        }

        return chain.proceed(request)
    }

}
