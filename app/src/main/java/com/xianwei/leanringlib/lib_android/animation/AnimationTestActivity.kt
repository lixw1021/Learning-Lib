package com.xianwei.leanringlib.lib_android.animation

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.animation.ValueAnimator.REVERSE
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd
import com.xianwei.leanringlib.R
import kotlinx.android.synthetic.main.activity_animation_test.*

class AnimationTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_test)

        setAnimation()
        setTextViewListener()
    }

    private fun setTextViewListener() {
        tv_one.setOnClickListener {
            Toast.makeText(this, "Tv one cliecked", Toast.LENGTH_SHORT).show()
        }

        tv_two.setOnClickListener {
            Toast.makeText(this, "Tv two cliecked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setAnimation() {
        btn_start_animation.setOnClickListener {

            /*
            * [ViewPropertyAnimator]
            * UseCase: apply several animation simultaneously or in sequence
            * */
            tv_one.animate()
                .alpha(0f)
                .translationX(-300f)
                .translationY(-100f)
                .setDuration(1000)
                .withEndAction {
                    tv_one.text = "New Text"
                    tv_one.animate()
                        .alpha(1f)
                        .translationX(0f)
                        .translationY(0f)
                        .setDuration(1000)
                        .start()
                }.start()
        }

        btn_start_animation2.setOnClickListener {
//            ObjectAnimator.ofFloat(tv_two, "translationY", 300f)
//                .apply {
//                    duration = 1000
//                    start()
//                }
//                .doOnEnd {
//                    ObjectAnimator.ofFloat(tv_two, "translationY", -0f)
//                        .apply {
//                            duration = 1000
//                            start()
//                        }
//                    tv_two.text = "updated text"
//                }

            val animattorTanslationY = ObjectAnimator.ofFloat(tv_two, "translationY", 300f).apply {
                duration = 1000
            }
            val animatorTanslationY2 = ObjectAnimator.ofFloat(tv_two, "translationY", -0f).apply {
                duration = 1000
            }
            val animatorFadeIn = ObjectAnimator.ofFloat(tv_two, "alpha", 1f).apply {
                duration = 1000
            }
            val animatorFadeOut = ObjectAnimator.ofFloat(tv_two, "alpha", 0.2f).apply {
                duration = 1000
            }

            AnimatorSet().apply {
                play(animattorTanslationY).with(animatorFadeOut).before(
                    AnimatorSet().apply {
                        play(animatorFadeIn).with(animatorTanslationY2)
                    }
                )
                start()
            }
        }
    }
}
