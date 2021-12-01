package me.simple.dialog

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

fun DialogFragment.setDismissed(dismissed: Boolean) {
    Utils.reflectFieldBoolean(DialogFragment::class.java, "mDismissed", this, dismissed)
}

fun DialogFragment.setShownByMe(shownByMe: Boolean) {
    Utils.reflectFieldBoolean(DialogFragment::class.java, "mShownByMe", this, shownByMe)
}

//
fun DialogFragment.show(manager: FragmentManager) {
    this.show(manager, this.javaClass.simpleName)
}

//
fun DialogFragment.show(transaction: FragmentTransaction) {
    this.show(transaction, this.javaClass.simpleName)
}

//
fun DialogFragment.showNow(manager: FragmentManager) {
    this.showNow(manager, this.javaClass.simpleName)
}

//
fun DialogFragment.showAllowingStateLoss(
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
fun DialogFragment.showNowAllowingStateLoss(
    manager: FragmentManager,
    tag: String = this.javaClass.simpleName
) {
    setDismissed(false)
    setShownByMe(true)

    val ft = manager.beginTransaction()
    ft.add(this, tag)
    ft.commitNowAllowingStateLoss()
}