package com.xianwei.learninglib.lib_android.backstack

import android.app.Activity
import android.os.Bundle
import com.xianwei.learninglib.R

class Activity1 : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activity1)
    }
}