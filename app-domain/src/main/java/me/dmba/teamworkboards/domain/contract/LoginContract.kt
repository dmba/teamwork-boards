package me.dmba.teamworkboards.domain.contract

import android.support.annotation.AnyThread
import android.support.annotation.MainThread
import me.dmba.teamworkboards.domain.base.BaseContract

/**
 * Created by dmba on 7/16/18.
 */
interface LoginContract {

    @MainThread
    interface View : BaseContract.View {

        fun showLoginError()

        fun loadLoginPage(loginUrl: String)

    }

    @MainThread
    interface Navigator : BaseContract.Navigator {

        fun goToLogin()

        fun goToBoards()

    }

    @AnyThread
    interface Presenter : BaseContract.Presenter {

        fun onReceiveLoginCode(code: String)

    }

}
