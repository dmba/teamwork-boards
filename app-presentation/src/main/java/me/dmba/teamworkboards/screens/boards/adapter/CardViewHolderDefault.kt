package me.dmba.teamworkboards.screens.boards.adapter

import android.view.ViewGroup
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.column_item.view.*
import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.data.model.entity.Card

class CardViewHolderDefault @AssistedInject constructor(

    //TODO workaround
    private val picasso: Picasso,

    @Assisted parent: ViewGroup

) : CardViewHolder(R.layout.column_item, R.id.column_item_layout, parent) {

    @AssistedInject.Factory
    interface Factory : CardViewHolderFactory {
        override fun create(parent: ViewGroup): CardViewHolderDefault
    }

    override fun onBind(model: Card) = itemView.run {
        cardTitle.text = model.name
    }

}
