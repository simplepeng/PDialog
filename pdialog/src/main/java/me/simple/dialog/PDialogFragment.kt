package me.simple.dialog

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

open class PDialogFragment : DialogFragment(), IDialog {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.PDialog)
    }

    override fun onStart() {
        initWindowSetting(dialog?.window)
        super.onStart()
    }

}