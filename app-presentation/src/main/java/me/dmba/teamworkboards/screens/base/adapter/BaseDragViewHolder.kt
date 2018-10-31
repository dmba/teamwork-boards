package me.dmba.teamworkboards.screens.base.adapter

import android.support.annotation.CallSuper
import android.support.annotation.IdRes
import android.support.annotation.LayoutRes
import android.view.View
import android.view.ViewGroup
import com.woxthebox.draglistview.DragItemAdapter
import me.dmba.teamworkboards.extensions.inflate

/**
 * Created by dmba on 7/18/18.
 */
abstract class BaseDragViewHolder<T>(

    @LayoutRes layoutRes: Int,

    @IdRes handleResId: Int,

    parent: ViewGroup,

    dragOnLongPress: Boolean = true

) : DragItemAdapter.ViewHolder(

    parent.inflate(layoutRes),

    handleResId,

    dragOnLongPress

) {

    private lateinit var onItemClicked: () -> Unit

    protected abstract fun onBind(model: T)

    @CallSuper
    override fun onItemClicked(view: View?) = onItemClicked()

    fun bind(model: T, onClick: (model: T) -> Unit = {}) {
        onItemClicked = { onClick(model) }
        onBind(model)
    }

}
