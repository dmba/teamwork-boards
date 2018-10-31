package me.dmba.teamworkboards.screens.base

import android.os.Bundle
import android.support.annotation.CallSuper
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import io.reactivex.disposables.CompositeDisposable
import me.dmba.teamworkboards.domain.base.BaseContract
import javax.inject.Inject

/**
 * Created by dmba on 7/17/18.
 */
abstract class BaseFragment<P : BaseContract.Presenter> constructor(

    @LayoutRes private val layoutId: Int

) : DaggerFragment() {

    @Inject
    lateinit var presenter: P

    protected val disposables = CompositeDisposable()

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(layoutId, container, false)
    }

    @CallSuper
    override fun onStart() {
        super.onStart()
        presenter.onStart()
    }

    @CallSuper
    override fun onStop() {
        presenter.onStop()
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        disposables.dispose()
    }

}
