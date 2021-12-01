package me.simple.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatDialogFragment

open class PDialogFragment : AppCompatDialogFragment(), IDialog {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.PDialog)
    }

    override fun onStart() {
        checkVisibleSoftInput(dialog?.window)
        checkHideBar(dialog?.window)
        initWindowSetting(dialog?.window)
        super.onStart()
    }

}