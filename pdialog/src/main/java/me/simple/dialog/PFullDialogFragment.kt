package me.simple.dialog

import android.view.WindowManager

open class PFullDialogFragment : PDialogFragment() {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

    override fun isHideBar() = true
}