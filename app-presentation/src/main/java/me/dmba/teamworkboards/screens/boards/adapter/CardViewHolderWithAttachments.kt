package me.dmba.teamworkboards.screens.boards.adapter

import android.view.ViewGroup
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.column_item_with_attachments.view.*
import me.dmba.teamworkboards.R
import me.dmba.teamworkboards.data.model.entity.Card

class CardViewHolderWithAttachments @AssistedInject constructor(

    private val picasso: Picasso,

    @Assisted parent: ViewGroup

) : CardViewHolder(R.layout.column_item_with_attachments, R.id.column_item_layout, parent) {

    @AssistedInject.Factory
    interface Factory : CardViewHolderFactory {
        override fun create(parent: ViewGroup): CardViewHolderWithAttachments
    }

    override fun onBind(model: Card) = itemView.run {
        cardTitle.text = model.name

        picasso.load("https://ksr-ugc.imgix.net/assets/016/597/308/5c42126bb290529a1cb36ca98afbb9f0_original.jpg?crop=faces&w=1552&h=873&fit=crop&v=1494344727&auto=format&q=92&s=4ed0aab6c3ed57d95ec5bbde85dda21c")
            .into(attachmentImage)
    }

}
