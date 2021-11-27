package demo.simple.pdialog.dialog_impl

import android.content.Context
import android.os.Bundle
import demo.simple.pdialog.R
import me.simple.dialog.PFullScreenDialog

class FullScreenDialogImpl(context: Context) : PFullScreenDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_full)
    }

    override fun isHideBar(): Boolean {
        return true
    }
}