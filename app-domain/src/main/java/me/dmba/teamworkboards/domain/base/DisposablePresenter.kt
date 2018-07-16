package me.dmba.teamworkboards.domain.base

import android.support.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by dmba on 7/16/18.
 */
internal abstract class DisposablePresenter : BaseContract.Presenter {

    protected val disposables = CompositeDisposable()

    override fun onViewCreated() {
    }

    @CallSuper
    override fun onViewDestroyed() {
        disposables.dispose()
    }

}

