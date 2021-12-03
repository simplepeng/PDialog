package demo.simple.pdialog.dialog_fragment_impl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import demo.simple.pdialog.R
import me.simple.dialog.PBottomDialogFragment

class BottomDialogFragmentImpl : PBottomDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_p_impl, container, false)
    }

    override fun isNotTouchModel() = true
}