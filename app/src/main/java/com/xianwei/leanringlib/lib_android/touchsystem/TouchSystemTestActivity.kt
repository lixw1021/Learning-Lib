package com.xianwei.leanringlib.lib_android.touchsystem

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import com.xianwei.leanringlib.R
import kotlinx.android.synthetic.main.activity_touch_system.*

class TouchSystemTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_touch_system)

        button.setOnClickListener{
            Log.v(javaClass.name, "button clicked")
        }
        testRelativeLayout.setOnClickListener {
            Log.v(javaClass.name, "testRelativeLayout clicked")
        }

    }

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.v(javaClass.name, "dispatchTouchEvent" + ev?.action)
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        Log.v(javaClass.name, "onTouchEvent" + event?.action )
        return super.onTouchEvent(event)
    }
}
