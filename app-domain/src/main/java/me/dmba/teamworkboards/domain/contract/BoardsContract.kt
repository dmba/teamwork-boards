package me.dmba.teamworkboards.domain.contract

import android.support.annotation.AnyThread
import android.support.annotation.MainThread
import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.data.model.entity.Column
import me.dmba.teamworkboards.domain.base.BaseContract

/**
 * Created by dmba on 7/17/18.
 */
interface BoardsContract {

    @MainThread
    interface View : BaseContract.View {

        fun showDataFetchError()

        fun showColumns(columns: List<Column>)

        fun updateCardsForColumn(column: Column, cards: List<Card>)

    }

    @MainThread
    interface Navigator : BaseContract.Navigator {

        fun goToCardDetails(card: Card)

    }

    @AnyThread
    interface Presenter : BaseContract.Presenter {

        fun onCardClick(card: Card)

        fun onRefreshColumnCards(column: Column)

    }

}
