package com.mvp.kyc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.veriff.*
import java.util.*

class VeriffActivity : AppCompatActivity() {

    private val REQUEST_CODE = 15

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veriff)

        val appLocale = Locale.ENGLISH

        val branding: Branding = Branding.Builder()
            .themeColor(resources.getColor(R.color.accent1))
            .backgroundColor(resources.getColor(R.color.background2))
            .toolbarIcon(R.drawable.mvp_logo)
            //  .toolbarIconProvider(toolbarIconProvider = IconDrawableProvider(""))
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
                "https://alchemy.veriff.com/v/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZXNzaW9uX2lkIjoiZDlmMGFkMjctZmJlNi00OTdkLTk3NmEtZTdjMjMyNjcxZDA1IiwiaWlkIjoiZjUzMzI3OGQtNWI3ZS00ZTRlLWJkZTEtNGJhZTBkM2EwZDQwIiwiaWF0IjoxNjc5MjI4NDUzfQ.9_XIGmxTNGMoTjZbuRIVuIDXpgP6624ZzQNReWD2620",
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
                //findNavController().navigate(VeriffFragmentDirections.actionVeriffFragmentToVeriffInfoFragment(args.verification))
            }
            Result.Status.CANCELED -> {
                //findNavController().navigate(VeriffFragmentDirections.navigateToEndingFragment())
            }
            Result.Status.ERROR -> {
                //  findNavController().navigate(VeriffFragmentDirections.navigateToEndingFragment())
            }
        }
    }
}