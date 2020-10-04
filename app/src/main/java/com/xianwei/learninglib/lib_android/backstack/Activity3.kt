package com.xianwei.learninglib.lib_android.backstack

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.xianwei.learninglib.MainActivity
import com.xianwei.learninglib.R
import kotlinx.android.synthetic.main.activity_activity1.*

class Activity3 : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1)
        text.text = "Activity 3"
        button.text = "Open Activity 1"
        button.setOnClickListener {
            finishAffinity()
//            startActivity(Intent(this, Activity1::class.java).apply {
//                flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
//            })
        }
    }
}