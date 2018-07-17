package me.dmba.teamworkboards.di.screens

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.dmba.teamworkboards.di.utils.ForActivity
import me.dmba.teamworkboards.screens.MainActivity

/**
 * Created by dmba on 7/17/18.
 */
@Module
interface ActivityBuilderModule {

    @ForActivity
    @ContributesAndroidInjector(
        modules = [
            MainActivityModule::class,
            FragmentBuilderModule::class,
            MvpModule::class
        ]
    )
    fun contributeMainActivity(): MainActivity

}
