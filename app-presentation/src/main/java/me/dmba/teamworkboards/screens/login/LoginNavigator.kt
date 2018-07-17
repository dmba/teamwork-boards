package me.dmba.teamworkboards.screens.login

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.domain.contract.LoginContract
import me.dmba.teamworkboards.screens.boards.BoardsFragment
import javax.inject.Inject

/**
 * Created by dmba on 7/14/18.
 */
class LoginNavigator @Inject constructor(

    private val fragmentManager: FragmentManager

) : LoginContract.Navigator {

    override fun goToLogin() = replace(LoginFragment())

    override fun goToBoards() = replace(BoardsFragment())

    private fun replace(fragment: Fragment) {
        fragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .commitAllowingStateLoss()
    }

}
