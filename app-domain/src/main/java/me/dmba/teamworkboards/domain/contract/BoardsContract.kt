package me.dmba.teamworkboards.domain.contract

import android.support.annotation.AnyThread
import android.support.annotation.MainThread
import me.dmba.teamworkboards.domain.base.BaseContract

/**
 * Created by dmba on 7/17/18.
 */
interface BoardsContract {

    @MainThread
    interface View : BaseContract.View {

        fun showGreetingTo(user: String)

        fun showDataFetchError()

    }

    @MainThread
    interface Navigator : BaseContract.Navigator {
    }

    @AnyThread
    interface Presenter : BaseContract.Presenter {
    }

}
