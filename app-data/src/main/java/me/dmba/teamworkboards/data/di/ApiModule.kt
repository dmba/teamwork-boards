package me.dmba.teamworkboards.data.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import me.dmba.teamworkboards.data.model.source.remote.api.*
import me.dmba.teamworkboards.data.model.source.remote.interceptors.TeamWorkEndpointInterceptor
import me.dmba.teamworkboards.data.model.source.remote.interceptors.TeamworkApiTokenInterceptor
import me.dmba.teamworkboards.data.model.source.remote.provider.TeamworkUrlProvider
import me.dmba.teamworkboards.data.model.source.remote.provider.TeamworkUrlProviderImpl
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 * Created by dmba on 7/16/18.
 */
@Module(
    includes = [
        ApiModuleBindings::class
    ]
)
internal object ApiModule {

    @Provides
    @Reusable
    @JvmStatic
    fun provideOkHttpClient(endpointInterceptor: TeamWorkEndpointInterceptor,
                            apiTokenInterceptor: TeamworkApiTokenInterceptor): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(endpointInterceptor)
        .addInterceptor(apiTokenInterceptor)
        .build()

    @Provides
    @Reusable
    @JvmStatic
    fun provideRetrofit(urlProvider: TeamworkUrlProvider, client: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl(urlProvider.apiUrl)
        .client(client)
        .build()

    @Provides
    @Reusable
    @JvmStatic
    fun provideAuthService(urlProvider: TeamworkUrlProvider): AuthenticationService {
        return Retrofit.Builder()
            .baseUrl(urlProvider.apiUrl)
            .build()
            .create(AuthenticationService::class.java)
    }

    @Provides
    @Reusable
    @JvmStatic
    fun provideAccountService(retrofit: Retrofit): AccountService = retrofit.create(AccountService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    fun provideActivityService(retrofit: Retrofit): ActivityService = retrofit.create(ActivityService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    fun provideProjectService(retrofit: Retrofit): ProjectService = retrofit.create(ProjectService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    fun provideTaskService(retrofit: Retrofit): TaskService = retrofit.create(TaskService::class.java)

}

@Module
internal interface ApiModuleBindings {

    @Binds
    @Reusable
    fun bindTeamworkUrls(teamworkUrlProvider: TeamworkUrlProviderImpl): TeamworkUrlProvider

}
