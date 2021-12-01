package me.simple.dialog

import android.view.Gravity
import android.view.Window
import android.view.WindowManager

interface IDialog {

    fun setWidth() = WindowManager.LayoutParams.WRAP_CONTENT

    fun setHeight() = WindowManager.LayoutParams.WRAP_CONTENT

    //设置外部背景的透明度
    fun setDimAmount() = 0.5f

    fun setGravity() = Gravity.CENTER

    //设置弹出和收起的动画
    fun setAnimRes(): Int = 0

    //是否自动显示软键盘
    //Android P(9.0)以上版本需要调用EditText.requestFocus()
    //让View获取到焦点才行
//    fun autoShowSoftInput() = false

    fun initWindowSetting(window: Window?) {
        if (window == null) return

//        if (autoShowSoftInput()) {
//            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE)
//            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
//        }

        val params = window.attributes

        params.width = setWidth()
        params.height = setHeight()
        params.dimAmount = setDimAmount()
        params.gravity = setGravity()

        window.setWindowAnimations(setAnimRes())

        window.attributes = params
    }
}