package me.dmba.teamworkboards.di.screens

import dagger.Module

/**
 * Created by dmba on 7/17/18.
 */
@Module(
    includes = [
        MvpModuleBindings::class
    ]
)
object MvpModule

@Module
interface MvpModuleBindings {
}
