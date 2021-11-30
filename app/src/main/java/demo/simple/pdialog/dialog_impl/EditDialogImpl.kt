package demo.simple.pdialog.dialog_impl

import android.content.Context
import android.os.Bundle
import android.widget.EditText
import demo.simple.pdialog.R
import me.simple.dialog.PDialog

class EditDialogImpl(context: Context) : PDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_edit)

        findViewById<EditText>(R.id.editText)?.requestFocus()
    }

    override fun autoShowSoftInput(): Boolean {
        return true
    }
}