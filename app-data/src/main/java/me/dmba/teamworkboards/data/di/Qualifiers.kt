package me.dmba.teamworkboards.data.di

import javax.inject.Qualifier

/**
 * Created by dmba on 7/16/18.
 */

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class KeyValueSession

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class KeyValuePrefs
