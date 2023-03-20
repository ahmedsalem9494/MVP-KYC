package com.example.veriffsdktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mvp.kyc.showMVPKYCScreen

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sessionUrl =  ""
        showMVPKYCScreen(sessionUrl)

    }


}