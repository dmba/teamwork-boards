package me.dmba.teamworkboards.screens.boards

import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.domain.contract.BoardsContract
import me.dmba.teamworkboards.screens.base.BaseFragment

/**
 * Created by dmba on 7/17/18.
 */
class BoardsFragment : BaseFragment<BoardsContract.Presenter>(R.layout.fragment_boards), BoardsContract.View {

    override fun showDataFetchError() {
    }

    override fun showGreetingTo(user: String) {
    }

}
