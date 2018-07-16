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
import me.dmba.teamworkboards.data.model.access.*
import me.dmba.teamworkboards.data.model.source.*
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

    @Binds
    @Reusable
    fun bindAuthRepo(repo: AuthRepoImpl): AuthRepo

}
