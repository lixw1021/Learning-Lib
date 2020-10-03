package com.xianwei.learninglib.lib_android.backstack

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.xianwei.learninglib.R
import kotlinx.android.synthetic.main.activity_activity1.*

class Activity1 : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1)
        button.text = "Open Activity 2"
        button.setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}