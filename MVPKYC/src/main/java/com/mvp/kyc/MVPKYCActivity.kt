package com.mvp.kyc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.veriff.*
import java.util.*

class MVPKYCActivity : AppCompatActivity() {

    private val REQUEST_CODE = 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veriff)

        val sessionUrl = intent.getStringExtra(EXTRA_SESSION_URL_KEY) ?: ""

        val appLocale = Locale.ENGLISH

        val branding: Branding = Branding.Builder()
            .themeColor(resources.getColor(R.color.accent1))
            .backgroundColor(resources.getColor(R.color.background2))
            .toolbarIcon(R.drawable.mvp_logo)
            .primaryButtonBackgroundColor(resources.getColor(R.color.accent1))
            .primaryTextColor(resources.getColor(R.color.textColor1))
            .secondaryTextColor(resources.getColor(R.color.textColor1))
            .bulletPoint(R.drawable.bullet_point_icon)
            .notificationIcon(R.drawable.mvp_icon) // not found in ios
            .font(Font.Builder().setBold(R.font.poppins_semi_bold).build())
            .font(Font.Builder().setRegular(R.font.poppins_regular).build())
            .build()

        val configuration = Configuration.Builder()
            .branding(branding)
            .locale(appLocale)
            .customIntroScreen(true)
            .build()
        val intent: Intent =
            Sdk.createLaunchIntent(
                this,
                sessionUrl,
                configuration
            )
        startActivityForResult(intent, REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_CODE) {
            val result = Result.fromResultIntent(data)
            result?.let { handleResult(it) }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }


    private fun handleResult(result: Result) {
        when (result.status) {
            Result.Status.DONE -> {
            }
            Result.Status.CANCELED -> {
            }
            Result.Status.ERROR -> {
            }
        }
    }
}