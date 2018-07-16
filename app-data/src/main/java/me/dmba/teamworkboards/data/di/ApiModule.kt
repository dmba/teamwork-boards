package me.dmba.teamworkboards.data.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import me.dmba.teamworkboards.data.model.source.remote.api.AccountService
import me.dmba.teamworkboards.data.model.source.remote.api.ActivityService
import me.dmba.teamworkboards.data.model.source.remote.api.ProjectService
import me.dmba.teamworkboards.data.model.source.remote.api.TaskService
import retrofit2.Retrofit

/**
 * Created by dmba on 7/16/18.
 */
@Module(
    includes = [
        ApiModuleBindings::class
    ]
)
object ApiModule {

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideRetrofit(): Retrofit = TODO()

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideAccountService(retrofit: Retrofit): AccountService = retrofit.create(AccountService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideActivityService(retrofit: Retrofit): ActivityService = retrofit.create(ActivityService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideProjectService(retrofit: Retrofit): ProjectService = retrofit.create(ProjectService::class.java)

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideTaskService(retrofit: Retrofit): TaskService = retrofit.create(TaskService::class.java)

}

@Module
internal interface ApiModuleBindings
