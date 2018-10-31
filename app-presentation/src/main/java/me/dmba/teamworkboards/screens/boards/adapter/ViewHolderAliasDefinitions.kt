package me.dmba.teamworkboards.screens.boards.adapter

import me.dmba.teamworkboards.data.model.entity.Card
import me.dmba.teamworkboards.screens.base.adapter.BaseDragViewHolder
import me.dmba.teamworkboards.screens.base.adapter.BaseViewHolderFactories
import me.dmba.teamworkboards.screens.base.adapter.BaseViewHolderFactory

/**
 * Created by dmba on 7/18/18.
 */

typealias CardViewHolder = BaseDragViewHolder<Card>

typealias CardViewHolderFactory = BaseViewHolderFactory<CardViewHolder>

typealias CardViewHolderFactories = BaseViewHolderFactories<CardViewHolderFactory>
