package me.simple.dialog

import android.app.Dialog
import android.content.Context

open class PDialog : Dialog, IDialog {

    constructor(context: Context) : super(context, R.style.PDialog)

    constructor(context: Context, themeResId: Int) : super(context, themeResId)

    override fun onStart() {
        initWindowSetting(window)
        super.onStart()
    }

}