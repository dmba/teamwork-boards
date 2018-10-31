package me.dmba.teamworkboards.domain.impl

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import me.dmba.teamworkboards.common.extensions.addTo
import me.dmba.teamworkboards.data.model.access.AuthRepo
import me.dmba.teamworkboards.domain.base.DisposablePresenter
import me.dmba.teamworkboards.domain.contract.LoginContract
import javax.inject.Inject

/**
 * Created by dmba on 7/16/18.
 */
internal class LoginPresenter @Inject constructor(

    private val view: LoginContract.View,

    private val navigator: LoginContract.Navigator,

    private val authRepo: AuthRepo

) : DisposablePresenter(), LoginContract.Presenter {

    override fun onStart() {
        if (authRepo.hasApiToken) {
            navigator.goToBoards()
        } else {
            view.loadLoginPage(authRepo.loginUrl)
        }
    }

    override fun onReceiveLoginCode(code: String) {
        authRepo.authenticate(code)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(this::onSuccess, this::onError)
            .addTo(disposables)
    }

    private fun onSuccess() {
        navigator.goToBoards()
    }

    private fun onError(throwable: Throwable) {
        view.showLoginError()
    }

}
