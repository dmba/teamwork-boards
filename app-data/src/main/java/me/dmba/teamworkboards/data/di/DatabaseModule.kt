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
object DatabaseModule {

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideDataBase(): TeamWorkDatabase = TODO()

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideAccountDao(db: TeamWorkDatabase): AccountDao = db.accountDao()

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideActivityDao(db: TeamWorkDatabase): ActivityDao = db.activityDao()

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideProjectDao(db: TeamWorkDatabase): ProjectDao = db.projectDao()

    @Provides
    @Reusable
    @JvmStatic
    internal fun provideTaskDao(db: TeamWorkDatabase): TaskDao = db.taskDao()

}


@Module
internal interface DatabaseModuleBindings
