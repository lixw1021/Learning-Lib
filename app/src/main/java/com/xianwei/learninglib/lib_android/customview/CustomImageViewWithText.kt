package com.xianwei.learninglib.lib_android.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.widget.ImageView
import com.xianwei.learninglib.R

class CustomImageViewWithText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ImageView(context, attrs, defStyleAttr) {
    private var label: String = ""
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val paint2 = Paint(Paint.ANTI_ALIAS_FLAG)
    private val rect = Rect()

    init {
        paint.color = Color.WHITE
        paint2.color = Color.MAGENTA
        paint.textSize = context.resources.getDimension(R.dimen.large_text)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        rect.left = width - 250
        rect.right = width + 100
        rect.top = 0
        rect.bottom = 100

        canvas.apply {
            save()
            rotate(45f, width - 100f, 50f)
            drawRect(rect, paint2)
            drawText(label, 0, label.length, width - 120f, 60f, paint)
            restore()
        }
        canvas.drawText("new", 0, 3, width/2f, height/2f, paint)
    }

    fun setLabel(label: String) {
        this.label = label
        invalidate()
    }
}
