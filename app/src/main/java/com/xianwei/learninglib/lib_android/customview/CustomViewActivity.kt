package com.xianwei.learninglib.lib_android.customview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xianwei.learninglib.R
import kotlinx.android.synthetic.main.activity_custom_view.*

class CustomViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_custom_view)

        add_label_btn.setOnClickListener{
            image.setLabel("Label")
        }
    }
}