package me.dmba.teamworkboards.screens.base.adapter

import android.view.ViewGroup

/**
 * Created by dmba on 7/18/18.
 */
interface BaseViewHolderFactory<VH> {

    fun create(parent: ViewGroup): VH

}
