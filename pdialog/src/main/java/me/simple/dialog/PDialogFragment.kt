package me.simple.dialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatDialogFragment

open class PDialogFragment : AppCompatDialogFragment(), IDialog {

    private var _onShowListener: (() -> Unit)? = null
    private var _onDismissListener: (() -> Unit)? = null
    private var _onCancelListener: (() -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NORMAL, R.style.PDialog)
    }

    override fun onStart() {
        checkVisibleSoftInput(dialog?.window)
        checkHideBar(dialog?.window)
        initWindowSetting(dialog?.window)

        dialog?.setOnShowListener {
            _onShowListener?.invoke()
        }

        super.onStart()
    }


    //
    fun setOnShowListener(listener: () -> Unit) {
        _onShowListener = listener
    }

    override fun onDestroyView() {
        super.onDestroyView()
        dialog?.setOnShowListener(null)
    }


    //
    fun setOnDismissListener(listener: () -> Unit) {
        _onDismissListener = listener
    }

    override fun onDismiss(dialog: DialogInterface) {
        super.onDismiss(dialog)
        _onDismissListener?.invoke()
    }


    //
    fun setOnCancelListener(listener: () -> Unit){
        _onCancelListener = listener
    }

    override fun onCancel(dialog: DialogInterface) {
        super.onCancel(dialog)
        _onCancelListener?.invoke()
    }
}