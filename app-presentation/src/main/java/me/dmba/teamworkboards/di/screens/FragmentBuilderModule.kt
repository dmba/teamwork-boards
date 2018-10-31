package me.dmba.teamworkboards.di.screens

import dagger.Module
import dagger.android.ContributesAndroidInjector
import me.dmba.teamworkboards.di.utils.ForFragment
import me.dmba.teamworkboards.screens.boards.BoardsFragment
import me.dmba.teamworkboards.screens.login.LoginFragment

/**
 * Created by dmba on 7/17/18.
 */
@Module
interface FragmentBuilderModule {

    @ForFragment
    @ContributesAndroidInjector
    fun contributeLoginFragment(): LoginFragment

    @ForFragment
    @ContributesAndroidInjector(
        modules = [
            FragmentBoardsModule::class
        ]
    )
    fun contributeBoardsFragment(): BoardsFragment

}
