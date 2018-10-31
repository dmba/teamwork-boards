package me.dmba.teamworkboards.screens.login

import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_login.*
import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.common.extensions.addTo
import me.dmba.teamworkboards.domain.contract.LoginContract
import me.dmba.teamworkboards.screens.base.BaseFragment
import me.dmba.teamworkboards.webkit.TeamworkLoginWebViewClient
import javax.inject.Inject

/**
 * Created by dmba on 7/14/18.
 */
class LoginFragment : BaseFragment<LoginContract.Presenter>(R.layout.fragment_login), LoginContract.View {

    @Inject
    lateinit var loginWebViewClient: TeamworkLoginWebViewClient

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupWebView()
    }

    override fun loadLoginPage(loginUrl: String) {
        webView.loadUrl(loginUrl)
    }

    override fun showLoginError() {
        Toast.makeText(context, R.string.app_something_went_wrong, Toast.LENGTH_LONG).show()
    }

    private fun setupWebView() = webView.apply {
        webViewClient = loginWebViewClient.apply {
            onReceiveLoginCode
                .subscribe(presenter::onReceiveLoginCode)
                .addTo(disposables)
        }

        settings.apply {
            javaScriptEnabled = true
        }
    }

}
