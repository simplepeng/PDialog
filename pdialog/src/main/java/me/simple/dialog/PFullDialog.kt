package me.simple.dialog

import android.content.Context
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import android.view.WindowInsetsController
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

open class PFullDialog(
    context: Context,
    themeResId: Int = R.style.PDialog
) : PDialog(context, themeResId) {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

    override fun isHideBar() = true

}