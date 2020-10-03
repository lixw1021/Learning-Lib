package com.xianwei.learninglib

import android.content.Intent
import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.xianwei.learninglib.lib_android.animation.AnimationTestActivity
import com.xianwei.learninglib.lib_android.backstack.Activity1
import com.xianwei.learninglib.lib_android.bottomsheet.BottomSheetTestActivity
import com.xianwei.learninglib.lib_android.customview.CustomViewActivity
import com.xianwei.learninglib.lib_android.touchsystem.TouchSystemTestActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this,"onNextIntent called", Toast.LENGTH_LONG ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        action_button.setOnClickListener {
            startActivity(Intent(this, AnimationTestActivity::class.java))
        }

        action_button2.visibility = View.VISIBLE
        action_button2.setOnClickListener {
            startActivity(Intent(this, BottomSheetTestActivity::class.java))
        }

        action_button3.visibility = View.VISIBLE
        action_button3.setOnClickListener {
            startActivity(Intent(this, TouchSystemTestActivity::class.java))
        }

        custom_view_button.apply {
            visibility = View.VISIBLE
            setOnClickListener {
                startActivity(Intent(this@MainActivity, CustomViewActivity::class.java))
            }
        }

        back_stack.setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
        }
    }
}
