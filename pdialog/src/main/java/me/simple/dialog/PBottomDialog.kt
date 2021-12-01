package me.simple.dialog

import android.content.Context
import android.view.Gravity
import android.view.WindowManager

open class PBottomDialog(context: Context) : PDialog(context) {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setGravity() = Gravity.BOTTOM

    override fun setAnimRes() = R.style.PBottomDialogAnim
}