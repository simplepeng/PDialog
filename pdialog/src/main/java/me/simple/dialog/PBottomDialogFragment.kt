package me.simple.dialog

import android.view.Gravity
import android.view.WindowManager

open class PBottomDialogFragment : PDialogFragment() {

    override fun setWidth() = WindowManager.LayoutParams.MATCH_PARENT

    override fun setGravity() = Gravity.BOTTOM

    override fun setAnimRes() = R.style.PBottomDialogAnim
}