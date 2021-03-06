package com.xianwei.learninglib.lib_android.backstack

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.xianwei.learninglib.MainActivity
import com.xianwei.learninglib.R
import kotlinx.android.synthetic.main.activity_activity1.*

class Activity2 : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1)
        text.text = "Activity 2"

        button.text = "Open Activity 3"
        button.setOnClickListener {
            startActivity(
                    Intent(this, Activity3::class.java)
                            .apply {
                                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                            }
            )
        }
    }
}