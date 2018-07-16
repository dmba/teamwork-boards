package me.dmba.teamworkboards.di.screens

import dagger.Binds
import dagger.Module
import me.dmba.teamworkboards.di.utils.ForActivity
import me.dmba.teamworkboards.di.utils.ForFragment
import me.dmba.teamworkboards.domain.contract.LoginContract
import me.dmba.teamworkboards.screens.login.LoginFragment
import me.dmba.teamworkboards.screens.login.LoginNavigator

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

    @Binds
    @ForFragment
    fun bindsLoginView(fragment: LoginFragment): LoginContract.View

    @Binds
    @ForActivity
    fun bindsLoginNavigator(navigator: LoginNavigator): LoginContract.Navigator

}
