package me.dmba.teamworkboards.screens.boards

import android.support.v4.app.FragmentManager
import me.dmba.teamworkboards.domain.contract.BoardsContract
import javax.inject.Inject

/**
 * Created by dmba on 7/14/18.
 */
class BoardsNavigator @Inject constructor(

    private val fragmentManager: FragmentManager

) : BoardsContract.Navigator {
}
