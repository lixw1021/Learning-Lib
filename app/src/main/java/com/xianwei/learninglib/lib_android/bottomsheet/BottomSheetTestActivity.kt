package com.xianwei.learninglib.lib_android.bottomsheet

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xianwei.learninglib.R
import kotlinx.android.synthetic.main.activity_main.*

class BottomSheetTestActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        action_button.text = "Bottom Sheet"
        action_button.setOnClickListener {
            val bottomSheet = CustomBottomSheet()
            bottomSheet.show(supportFragmentManager, "")
        }
    }
}