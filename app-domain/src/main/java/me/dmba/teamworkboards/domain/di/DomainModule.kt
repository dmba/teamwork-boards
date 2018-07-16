package me.dmba.teamworkboards.domain.di

import dagger.Binds
import dagger.Module
import me.dmba.teamworkboards.domain.contract.LoginContract
import me.dmba.teamworkboards.domain.impl.LoginPresenter

/**
 * Created by dmba on 7/16/18.
 */
@Module(
    includes = [
        DomainModuleBindings::class
    ]
)
object DomainModule

@Module
internal interface DomainModuleBindings {

    @Binds
    fun bindsLoginPresenter(presenter: LoginPresenter): LoginContract.Presenter

}
