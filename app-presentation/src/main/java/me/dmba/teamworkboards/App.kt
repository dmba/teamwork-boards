package me.dmba.teamworkboards

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import me.dmba.teamworkboards.di.AppComponent
import me.dmba.teamworkboards.di.DaggerAppComponent

/**
 * Created by dmba on 7/17/18.
 */
class App : DaggerApplication() {

    private val component: AppComponent by lazy {
        DaggerAppComponent.builder()
            .app(this)
            .build()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = component

}
