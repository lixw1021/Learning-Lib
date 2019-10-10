package com.xianwei.leanringlib

import android.content.Intent
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.xianwei.leanringlib.lib_android.animation.AnimationTestActivity
import com.xianwei.leanringlib.lib_android.bottomsheet.BottomSheetTestActivity
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
    }
}
