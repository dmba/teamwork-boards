package me.dmba.teamworkboards.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import me.dmba.teamworkboards.App
import me.dmba.teamworkboards.data.di.DataModule
import me.dmba.teamworkboards.di.screens.ActivityBuilderModule
import me.dmba.teamworkboards.di.utils.ForApplication
import me.dmba.teamworkboards.domain.di.DomainModule

/**
 * Created by dmba on 7/17/18.
 */
@ForApplication
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class,
        AppModule::class,
        DomainModule::class,
        DataModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun app(app: App): Builder

        fun build(): AppComponent

    }

}
