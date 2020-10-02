package com.xianwei.learninglib

import android.content.Intent
import android.os.Bundle
import android.view.View
<<<<<<< HEAD:app/src/main/java/com/xianwei/leanringlib/MainActivity.kt
import com.xianwei.leanringlib.lib_android.animation.AnimationTestActivity
import com.xianwei.leanringlib.lib_android.bottomsheet.BottomSheetTestActivity
import com.xianwei.leanringlib.lib_android.touchsystem.TouchSystemTestActivity
=======
import androidx.appcompat.app.AppCompatActivity
import com.xianwei.learninglib.lib_android.animation.AnimationTestActivity
import com.xianwei.learninglib.lib_android.bottomsheet.BottomSheetTestActivity
import com.xianwei.learninglib.lib_android.customview.CustomViewActivity
>>>>>>> c97c11e5ce332d8f576103febefceef7780a4c08:app/src/main/java/com/xianwei/learninglib/MainActivity.kt
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

<<<<<<< HEAD:app/src/main/java/com/xianwei/leanringlib/MainActivity.kt
        action_button3.visibility = View.VISIBLE
        action_button3.setOnClickListener {
            startActivity(Intent(this, TouchSystemTestActivity::class.java))
=======
        custom_view_button.visibility = View.VISIBLE
        custom_view_button.setOnClickListener {
            startActivity(Intent(this, CustomViewActivity::class.java))
>>>>>>> c97c11e5ce332d8f576103febefceef7780a4c08:app/src/main/java/com/xianwei/learninglib/MainActivity.kt
        }
    }
}
