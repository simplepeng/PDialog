package me.simple.dialog

import android.content.Context
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

open class PFullDialog(
    context: Context,
    themeResId: Int = R.style.PFullDialog
) : PDialog(context, themeResId) {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

}