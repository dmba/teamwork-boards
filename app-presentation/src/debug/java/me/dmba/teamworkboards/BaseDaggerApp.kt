package me.dmba.teamworkboards

import android.webkit.WebView
import com.facebook.stetho.Stetho
import dagger.android.support.DaggerApplication

/**
 * Created by dmba on 7/17/18.
 */
abstract class BaseDaggerApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
        WebView.setWebContentsDebuggingEnabled(true);
    }

}
