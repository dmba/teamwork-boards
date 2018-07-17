package me.dmba.teamworkboards.di.screens

import android.app.Activity
import android.support.v4.app.FragmentManager
import android.transition.TransitionInflater
import android.view.LayoutInflater
import dagger.Binds
import dagger.Module
import dagger.Provides
import me.dmba.teamworkboards.di.utils.ForActivity
import me.dmba.teamworkboards.screens.MainActivity

/**
 * Created by dmba on 7/17/18.
 */
@Module(
    includes = [
        MainActivityBindingsModule::class
    ]
)
object MainActivityModule {

    @Provides
    @JvmStatic
    @ForActivity
    fun provideLayoutInflater(activity: MainActivity): LayoutInflater = activity.layoutInflater

    @Provides
    @JvmStatic
    @ForActivity
    fun provideTransitionInflater(activity: MainActivity): TransitionInflater = TransitionInflater.from(activity)

    @Provides
    @JvmStatic
    @ForActivity
    fun provideFragmentManager(activity: MainActivity): FragmentManager = activity.supportFragmentManager

}

@Module
interface MainActivityBindingsModule {

    @Binds
    @ForActivity
    fun bindsActivity(activity: MainActivity): Activity

}
