package me.dmba.teamworkboards.screens.boards

import kotlinx.android.synthetic.main.fragment_boards.*
import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.domain.contract.BoardsContract
import me.dmba.teamworkboards.screens.base.BaseFragment

/**
 * Created by dmba on 7/17/18.
 */
class BoardsFragment : BaseFragment<BoardsContract.Presenter>(R.layout.fragment_boards), BoardsContract.View {

    override fun showGreetingTo(user: String) {
        textView.text = getString(R.string.app_hello_user, user)
    }

    override fun showDataFetchError() {
        textView.text = getString(R.string.app_something_went_wrong)
    }

}
