package me.simple.dialog

import android.os.Bundle
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

    //
    open fun show(manager: FragmentManager) {
        super.show(manager, this.javaClass.simpleName)
    }

    //
    open fun show(transaction: FragmentTransaction) {
        super.show(transaction, this.javaClass.simpleName)
    }

    //
    open fun showNow(manager: FragmentManager) {
        super.showNow(manager, this.javaClass.simpleName)
    }

    //
    open fun showAllowingStateLoss(
        manager: FragmentManager,
        tag: String = this.javaClass.simpleName
    ) {
        setDismissed(false)
        setShownByMe(true)

        val ft = manager.beginTransaction()
        ft.add(this, tag)
        ft.commitAllowingStateLoss()
    }

    //
    open fun showNowAllowingStateLoss(
        manager: FragmentManager,
        tag: String = this.javaClass.simpleName
    ) {
        setDismissed(false)
        setShownByMe(true)

        val ft = manager.beginTransaction()
        ft.add(this, tag)
        ft.commitNowAllowingStateLoss()
    }

    private fun setDismissed(dismissed: Boolean) {
        Utils.reflectFieldBoolean(DialogFragment::class.java, "mDismissed", this, dismissed)
    }

    private fun setShownByMe(shownByMe: Boolean) {
        Utils.reflectFieldBoolean(DialogFragment::class.java, "mShownByMe", this, shownByMe)
    }

}