package me.dmba.teamworkboards.di

import android.app.Application
import android.content.Context
import com.squareup.picasso.Picasso
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Reusable
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
object AppModule {

    @Provides
    @JvmStatic
    @Reusable
    fun providePicasso(context: Context): Picasso = Picasso.with(context)

}

@Module
interface AppBindingsModule {

    @Binds
    @ForApplication
    fun bindsContext(app: App): Context

    @Binds
    @ForApplication
    fun bindsApplication(app: App): Application

}
