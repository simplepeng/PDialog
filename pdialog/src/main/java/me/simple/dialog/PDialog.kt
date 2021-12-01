package me.simple.dialog

import android.content.Context
import androidx.appcompat.app.AppCompatDialog

open class PDialog(
    context: Context,
    themeResId: Int = R.style.PDialog
) : AppCompatDialog(context, themeResId), IDialog {

    override fun onStart() {
        initWindowSetting(window)
        super.onStart()
    }

}