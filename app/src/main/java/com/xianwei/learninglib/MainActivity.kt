package com.xianwei.learninglib

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.xianwei.learninglib.lib_android.animation.AnimationTestActivity
import com.xianwei.learninglib.lib_android.bottomsheet.BottomSheetTestActivity
import com.xianwei.learninglib.lib_android.customview.CustomViewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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

        custom_view_button.visibility = View.VISIBLE
        custom_view_button.setOnClickListener {
            startActivity(Intent(this, CustomViewActivity::class.java))
        }
    }
}
