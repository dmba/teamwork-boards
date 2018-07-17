package me.dmba.teamworkboards.screens

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.domain.contract.LoginContract
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var loginNavigator: LoginContract.Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginNavigator.goToLogin()
    }

}
