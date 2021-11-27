package me.simple.dialog

import android.graphics.Color
import android.os.Build
import android.view.WindowManager

abstract class PFullScreenDialogFragment : PDialogFragment() {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

    //是否隐藏状态栏
    protected open fun isHideBar(): Boolean = true

    override fun onStart() {
        hideBar()
        super.onStart()
    }

    private fun hideBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && isHideBar()) {
            dialog?.window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            dialog?.window?.statusBarColor = Color.TRANSPARENT
        }
    }
}