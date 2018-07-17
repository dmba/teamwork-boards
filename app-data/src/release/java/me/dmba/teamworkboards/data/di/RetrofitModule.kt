package me.dmba.teamworkboards.data.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import me.dmba.teamworkboards.data.model.source.remote.interceptors.TeamWorkEndpointInterceptor
import me.dmba.teamworkboards.data.model.source.remote.interceptors.TeamworkApiTokenInterceptor
import me.dmba.teamworkboards.data.model.source.remote.provider.TeamworkUrlProvider
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by dmba on 7/17/18.
 */

@Module
internal object RetrofitModule {

    @Provides
    @Reusable
    @JvmStatic
    @Auth
    fun provideAuthOkHttpClient(): OkHttpClient = OkHttpClient()

    @Provides
    @Reusable
    @JvmStatic
    @Api
    fun provideApiOkHttpClient(@Auth client: OkHttpClient,
                               endpointInterceptor: TeamWorkEndpointInterceptor,
                               apiTokenInterceptor: TeamworkApiTokenInterceptor): OkHttpClient = client.newBuilder()
        .addInterceptor(endpointInterceptor)
        .addInterceptor(apiTokenInterceptor)
        .build()

    @Provides
    @Reusable
    @JvmStatic
    @Auth
    fun provideAuthRetrofit(@Auth client: OkHttpClient,
                            urlProvider: TeamworkUrlProvider): Retrofit = Retrofit.Builder()
        .baseUrl(urlProvider.apiUrl)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    @Provides
    @Reusable
    @JvmStatic
    @Api
    fun provideApiRetrofit(@Api client: OkHttpClient,
                           @Auth retrofit: Retrofit): Retrofit = retrofit.newBuilder()
        .client(client)
        .build()

}
