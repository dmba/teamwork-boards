package me.dmba.teamworkboards.screens.login

import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.domain.contract.LoginContract
import me.dmba.teamworkboards.screens.base.BaseFragment

/**
 * Created by dmba on 7/14/18.
 */
class LoginFragment : BaseFragment<LoginContract.Presenter>(R.layout.fragment_login), LoginContract.View {

    override fun showLoginError() {
        TODO("not implemented")
    }

    override fun loadLoginPage(loginUrl: String) {
        TODO("not implemented")
    }

}
