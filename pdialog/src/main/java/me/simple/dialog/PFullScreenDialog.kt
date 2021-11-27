package me.simple.dialog

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.view.WindowManager

abstract class PFullScreenDialog(context: Context) : PDialog(context) {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

    protected open fun isHideBar(): Boolean = true

    override fun onStart() {
        hideBar()
        super.onStart()
    }

    private fun hideBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && isHideBar()) {
            window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window?.statusBarColor = Color.TRANSPARENT
        }
    }
}