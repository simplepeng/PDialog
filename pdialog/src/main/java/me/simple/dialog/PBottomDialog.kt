package me.simple.dialog

import android.content.Context
import android.view.Gravity
import android.view.WindowManager

open class PBottomDialog(
    context: Context,
    themeResId: Int = R.style.PDialog
) : PDialog(context, themeResId) {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setGravity() = Gravity.BOTTOM

    override fun setAnimRes() = R.style.PBottomDialogAnim
}