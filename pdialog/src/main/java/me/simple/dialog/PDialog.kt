package me.simple.dialog

import android.content.Context
import androidx.appcompat.app.AppCompatDialog

open class PDialog : AppCompatDialog, IDialog {

    constructor(context: Context) : super(context, R.style.PDialog)

    constructor(context: Context, themeResId: Int) : super(context, themeResId)

    override fun onStart() {
        initWindowSetting(window)
        super.onStart()
    }

}