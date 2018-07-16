package me.dmba.teamworkboards.data.di

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
import me.dmba.teamworkboards.data.keyvalue.KeyValue
import me.dmba.teamworkboards.data.keyvalue.SessionKeyValue
import me.dmba.teamworkboards.data.keyvalue.SharedPrefsKeyValue
import me.dmba.teamworkboards.data.model.access.AccountRepo
import me.dmba.teamworkboards.data.model.access.ActivityRepo
import me.dmba.teamworkboards.data.model.access.ProjectRepo
import me.dmba.teamworkboards.data.model.access.TaskRepo
import me.dmba.teamworkboards.data.model.source.AccountRepoImpl
import me.dmba.teamworkboards.data.model.source.ActivityRepoImpl
import me.dmba.teamworkboards.data.model.source.ProjectRepoImpl
import me.dmba.teamworkboards.data.model.source.TaskRepoImpl
import javax.inject.Singleton

/**
 * Created by dmba on 7/16/18.
 */
@Module(
    includes = [
        DataModuleBindings::class,
        ApiModule::class,
        DatabaseModule::class
    ]
)
object DataModule {

    @Provides
    @JvmStatic
    @Reusable
    internal fun provideSharedPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(context.applicationInfo.packageName, MODE_PRIVATE)
    }

}

@Module
internal interface DataModuleBindings {

    @Binds
    @Singleton
    @KeyValueSession
    fun bindsSessionKeyValue(storage: SessionKeyValue): KeyValue

    @Binds
    @Reusable
    @KeyValuePrefs
    fun bindsPrefsKeyValue(storage: SharedPrefsKeyValue): KeyValue

    @Binds
    @Reusable
    fun bindAccountRepo(repo: AccountRepoImpl): AccountRepo

    @Binds
    @Reusable
    fun bindActivityRepo(repo: ActivityRepoImpl): ActivityRepo

    @Binds
    @Reusable
    fun bindProjectRepo(repo: ProjectRepoImpl): ProjectRepo

    @Binds
    @Reusable
    fun bindTaskRepo(repo: TaskRepoImpl): TaskRepo

}
