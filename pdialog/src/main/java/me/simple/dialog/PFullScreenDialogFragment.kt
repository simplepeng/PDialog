package me.simple.dialog

import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && isHideBar()) {
//            dialog?.window?.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//            dialog?.window?.statusBarColor = Color.TRANSPARENT
//        }
        val decorView = dialog?.window?.decorView ?: return
        if (isHideBar()) {
            val controller = ViewCompat.getWindowInsetsController(decorView) ?: return
            controller.hide(WindowInsetsCompat.Type.statusBars())
        }
    }
}