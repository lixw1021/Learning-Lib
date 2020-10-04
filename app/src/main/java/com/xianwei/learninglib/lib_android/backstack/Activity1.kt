package com.xianwei.learninglib.lib_android.backstack

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.xianwei.learninglib.R
import kotlinx.android.synthetic.main.activity_activity1.*

class Activity1 : Activity() {

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "activity 1 onNewIntent called", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1)
        text.text = "Activity 1"
        button.text = "Open Activity 2"
        button.setOnClickListener {
            startActivity(
                    Intent(this, Activity2::class.java)
                            .apply {
                                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK
                            }
            )
        }
    }
}
/*
* start activity in a new task and keep previous task, Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_MULTIPLE_TASK
*
* clean current task and open activity in new task, Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
*
* open existing activity and clean all above it, Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP -> onNewIntent()
*
* */