package me.simple.dialog

import android.content.Context
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

open class PFullScreenDialog(context: Context) : PDialog(context) {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

    //是否隐藏状态栏
    protected open fun isHideBar(): Boolean = true

    override fun onStart() {
        hideBar()
        super.onStart()
    }

    private fun hideBar() {
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && isHideBar()) {
//            window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//            window?.statusBarColor = Color.TRANSPARENT
//        }
        val decorView = window?.decorView ?: return
        if (isHideBar()) {
            val controller = ViewCompat.getWindowInsetsController(decorView) ?: return
            controller.hide(WindowInsetsCompat.Type.statusBars())
        }
    }
}