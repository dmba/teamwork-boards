package me.dmba.teamworkboards.common.extensions

import io.reactivex.disposables.Disposable
import io.reactivex.internal.disposables.DisposableContainer

/**
 * Created by dmba on 7/16/18.
 */

operator fun DisposableContainer.plusAssign(disposable: Disposable) {
    add(disposable)
}

fun Disposable.addTo(disposables: DisposableContainer): Disposable = also { disposables += this }
