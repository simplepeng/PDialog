package me.simple.dialog

import android.os.Bundle
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

open class PFullDialogFragment : PDialogFragment() {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setHeight() = WindowManager.LayoutParams.MATCH_PARENT

    //是否隐藏状态栏
    protected open fun isHideBar(): Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.PFullDialog)
    }
}