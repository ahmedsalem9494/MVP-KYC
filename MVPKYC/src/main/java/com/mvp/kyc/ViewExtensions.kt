package com.mvp.kyc

import android.content.Context
import android.content.Intent


 const val EXTRA_SESSION_URL_KEY = "session_url_key"

fun Context.showMVPKYCScreen(sessionUrl : String) {
    val intent = Intent(this, MVPKYCActivity::class.java)
    intent.putExtra(EXTRA_SESSION_URL_KEY, sessionUrl)
    startActivity(intent)
}