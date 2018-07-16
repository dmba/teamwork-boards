package me.dmba.teamworkboards.data.di

import dagger.Binds
import dagger.Module
import dagger.Reusable
import me.dmba.teamworkboards.data.model.access.AccountRepo
import me.dmba.teamworkboards.data.model.access.ActivityRepo
import me.dmba.teamworkboards.data.model.access.ProjectRepo
import me.dmba.teamworkboards.data.model.access.TaskRepo
import me.dmba.teamworkboards.data.model.source.AccountRepoImpl
import me.dmba.teamworkboards.data.model.source.ActivityRepoImpl
import me.dmba.teamworkboards.data.model.source.ProjectRepoImpl
import me.dmba.teamworkboards.data.model.source.TaskRepoImpl

/**
 * Created by dmba on 7/16/18.
 */
@Module(
    includes = [
        DataModuleBindings::class,
        ApiModule::class
    ]
)
object DataModule

@Module
internal interface DataModuleBindings {

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
