package me.dmba.teamworkboards.domain.base

import android.support.annotation.AnyThread
import android.support.annotation.MainThread

/**
 * Created by dmba on 7/16/18.
 */
class BaseContract {

    @MainThread
    interface View

    @MainThread
    interface Navigator

    @AnyThread
    interface Presenter {

        fun onStart()

        fun onStop()

    }

}
