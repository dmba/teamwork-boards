package me.dmba.teamworkboards.data.model.source.remote.interceptors

import me.dmba.teamworkboards.data.model.access.AuthRepo
import me.dmba.teamworkboards.data.util.HTTP_HEADER_AUTHORIZATION
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class TeamworkApiTokenInterceptor @Inject constructor(

    private val repo: AuthRepo

) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        var request: Request = chain.request()

        if (repo.hasApiToken) {
            request = request.newBuilder()
                .header(HTTP_HEADER_AUTHORIZATION, "Bearer ${repo.apiToken}")
                .build()
        }

        return chain.proceed(request)
    }

}
