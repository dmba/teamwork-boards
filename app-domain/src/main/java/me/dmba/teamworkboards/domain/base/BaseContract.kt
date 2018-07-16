package me.dmba.teamworkboards.domain.base

/**
 * Created by dmba on 7/16/18.
 */
class BaseContract {

    interface View

    interface Navigator

    interface Presenter {

        fun onViewCreated()

        fun onViewDestroyed()

    }

}
