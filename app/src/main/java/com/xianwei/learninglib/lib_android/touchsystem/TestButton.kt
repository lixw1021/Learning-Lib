package com.xianwei.leanringlib.lib_android.touchsystem

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.Button

class TestButton @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : Button(context, attributeSet, defStyleAttr) {

    init {
        Log.v(javaClass.name, "init")
    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.v(javaClass.name, "dispatchTouchEvent")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.v(javaClass.name, "onTouchEvent")
        return super.onTouchEvent(event)
    }
}
