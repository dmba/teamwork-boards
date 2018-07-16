package me.dmba.teamworkboards.data.model.source.local

import me.dmba.teamworkboards.data.model.source.local.dao.AccountDao
import me.dmba.teamworkboards.data.model.source.local.dao.ActivityDao
import me.dmba.teamworkboards.data.model.source.local.dao.ProjectDao
import me.dmba.teamworkboards.data.model.source.local.dao.TaskDao

/**
 * Created by dmba on 7/16/18.
 */
internal abstract class TeamWorkDatabase {

    abstract fun accountDao(): AccountDao

    abstract fun activityDao(): ActivityDao

    abstract fun projectDao(): ProjectDao

    abstract fun taskDao(): TaskDao

}
