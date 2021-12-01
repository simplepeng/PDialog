package demo.simple.pdialog.dialog_fragment_impl

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import demo.simple.pdialog.R
import me.simple.dialog.PDialogFragment

class EditDialogFragmentImpl : PDialogFragment() {

    override fun isShowSoftInput() = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_edit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<EditText>(R.id.editText)?.requestFocus()
    }

}