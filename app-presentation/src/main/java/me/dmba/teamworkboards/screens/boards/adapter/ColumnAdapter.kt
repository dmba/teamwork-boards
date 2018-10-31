package me.dmba.teamworkboards.screens.boards.adapter

import android.view.ViewGroup
import com.woxthebox.draglistview.DragItemAdapter
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject
import me.dmba.teamworkboards.data.model.entity.Card
import javax.inject.Inject

class ColumnAdapter @Inject constructor(

    private val factories: CardViewHolderFactories

) : DragItemAdapter<Card, CardViewHolder>() {

    val onItemClick: Subject<Card> = PublishSubject.create()

    val onDataSetChanged: Subject<Boolean> = PublishSubject.create()

    override fun getItemViewType(position: Int) = if (itemList[position].hasAttachments) {
        CARD_TYPE_WITH_ATTACHMENTS
    } else {
        CARD_TYPE_DEFAULT
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return factories[viewType]!!.create(parent)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.bind(itemList[position], onItemClick::onNext)
    }

    override fun getUniqueItemId(position: Int): Long {
        return itemList[position].id.toLong()
    }

    fun updateCards(newCards: List<Card>) {
        itemList = newCards
        onDataSetChanged.onNext(true)
    }

}
