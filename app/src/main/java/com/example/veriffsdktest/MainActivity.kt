package com.example.veriffsdktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mvp.kyc.showMVPKYCScreen

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sessionUrl =
            "https://alchemy.veriff.com/v/eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZXNzaW9uX2lkIjoiZDlmMGFkMjctZmJlNi00OTdkLTk3NmEtZTdjMjMyNjcxZDA1IiwiaWlkIjoiZjUzMzI3OGQtNWI3ZS00ZTRlLWJkZTEtNGJhZTBkM2EwZDQwIiwiaWF0IjoxNjc5MjI4NDUzfQ.9_XIGmxTNGMoTjZbuRIVuIDXpgP6624ZzQNReWD2620"
        showMVPKYCScreen(sessionUrl)

    }


}