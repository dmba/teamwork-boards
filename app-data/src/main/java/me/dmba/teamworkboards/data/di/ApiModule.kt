package me.dmba.teamworkboards.data.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import me.dmba.teamworkboards.data.model.source.remote.api.*
import me.dmba.teamworkboards.data.model.source.remote.provider.TeamworkUrlProvider
import me.dmba.teamworkboards.data.model.source.remote.provider.TeamworkUrlProviderImpl
import retrofit2.Retrofit

/**
 * Created by dmba on 7/16/18.
 */
@Module(
    includes = [
        ApiModuleBindings::class,
        RetrofitModule::class
    ]
)
internal object ApiModule {

    @Provides
    @Reusable
    @JvmStatic
    fun provideAuthService(@Auth retrofit: Retrofit): AuthService = retrofit.create(AuthService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    fun provideAccountService(@Api retrofit: Retrofit): AccountService = retrofit.create(AccountService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    fun provideActivityService(@Api retrofit: Retrofit): ActivityService = retrofit.create(ActivityService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    fun provideProjectService(@Api retrofit: Retrofit): ProjectService = retrofit.create(ProjectService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    fun provideTaskService(@Api retrofit: Retrofit): TaskService = retrofit.create(TaskService::class.java)

}

@Module
internal interface ApiModuleBindings {

    @Binds
    @Reusable
    fun bindTeamworkUrls(teamworkUrlProvider: TeamworkUrlProviderImpl): TeamworkUrlProvider

}
