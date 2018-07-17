package me.dmba.teamworkboards.webkit

import android.net.Uri
import android.net.Uri.parse
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.Subject
import me.dmba.teamworkboards.data.model.access.AuthRepo
import me.dmba.teamworkboards.utils.KEY_CODE
import javax.inject.Inject

/**
 * Created by dmba on 7/17/18.
 */
class TeamworkLoginWebViewClient @Inject constructor(

    private val authRepo: AuthRepo

) : WebViewClient() {

    val onReceiveLoginCode: Subject<String> = BehaviorSubject.create()

    val loginRedirectUri: Uri by lazy { parse(authRepo.loginRedirectUrl) }

    override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
        return if (request.url.scheme == loginRedirectUri.scheme) {
            onReceiveLoginCode.onNext(request.url.getQueryParameter(KEY_CODE))
            true
        } else {
            false
        }
    }

}
