package me.simple.dialog

import android.content.Context
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

open class PFullDialog(context: Context) : PDialog(context, R.style.PFullDialog) {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

}