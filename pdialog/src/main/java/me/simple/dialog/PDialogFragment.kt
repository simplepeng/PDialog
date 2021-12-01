package me.simple.dialog

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatDialogFragment

open class PDialogFragment : AppCompatDialogFragment(), IDialog {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.PDialog)
    }

    override fun onStart() {
        initWindowSetting(dialog?.window)
        super.onStart()
    }

    override fun onGetLayoutInflater(savedInstanceState: Bundle?): LayoutInflater {
        return super.onGetLayoutInflater(savedInstanceState)
    }
}