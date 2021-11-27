package demo.simple.pdialog.dialog_impl

import android.content.Context
import android.os.Bundle
import demo.simple.pdialog.R
import me.simple.dialog.PBottomDialog

class EditBottomDialogImpl(context: Context) : PBottomDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_edit)
    }

    override fun autoShowSoftInput(): Boolean {
        return true
    }
}