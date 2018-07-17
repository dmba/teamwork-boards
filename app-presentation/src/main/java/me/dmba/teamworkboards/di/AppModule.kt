package me.dmba.teamworkboards.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import me.dmba.teamworkboards.App
import me.dmba.teamworkboards.di.utils.ForApplication

/**
 * Created by dmba on 7/17/18.
 */
@Module(
    includes = [
        AppBindingsModule::class
    ]
)
object AppModule

@Module
interface AppBindingsModule {

    @Binds
    @ForApplication
    fun bindsContext(app: App): Context

    @Binds
    @ForApplication
    fun bindsApplication(app: App): Application

}
