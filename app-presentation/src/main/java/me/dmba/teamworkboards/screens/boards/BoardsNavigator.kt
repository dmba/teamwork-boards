package me.dmba.teamworkboards.screens.boards

import android.content.Context
import android.support.v4.app.FragmentManager
import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.domain.contract.BoardsContract
import org.jetbrains.anko.toast
import javax.inject.Inject

/**
 * Created by dmba on 7/14/18.
 */
class BoardsNavigator @Inject constructor(

    private val fragmentManager: FragmentManager,

    private val context: Context

) : BoardsContract.Navigator {

    //TODO
    override fun goToCardDetails(card: Card) {
        context.toast("Going to details of \"${card.name}\"")
    }

}
