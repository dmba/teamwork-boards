package me.dmba.teamworkboards.data.di

import dagger.Module
import dagger.Provides
import dagger.Reusable
import me.dmba.teamworkboards.data.model.source.local.TeamWorkDatabase
import me.dmba.teamworkboards.data.model.source.local.dao.AccountDao
import me.dmba.teamworkboards.data.model.source.local.dao.ActivityDao
import me.dmba.teamworkboards.data.model.source.local.dao.ProjectDao
import me.dmba.teamworkboards.data.model.source.local.dao.TaskDao

/**
 * Created by dmba on 7/16/18.
 */
@Module(
    includes = [
        DatabaseModuleBindings::class
    ]
)
internal object DatabaseModule {

    @Provides
    @Reusable
    @JvmStatic
    fun provideDataBase(): TeamWorkDatabase = TODO()

    @Provides
    @Reusable
    @JvmStatic
    fun provideAccountDao(db: TeamWorkDatabase): AccountDao = db.accountDao()

    @Provides
    @Reusable
    @JvmStatic
    fun provideActivityDao(db: TeamWorkDatabase): ActivityDao = db.activityDao()

    @Provides
    @Reusable
    @JvmStatic
    fun provideProjectDao(db: TeamWorkDatabase): ProjectDao = db.projectDao()

    @Provides
    @Reusable
    @JvmStatic
    fun provideTaskDao(db: TeamWorkDatabase): TaskDao = db.taskDao()

}


@Module
internal interface DatabaseModuleBindings
