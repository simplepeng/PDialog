package demo.simple.pdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import demo.simple.pdialog.databinding.ActivityMainBinding
import demo.simple.pdialog.dialog_fragment_impl.*
import demo.simple.pdialog.dialog_impl.*
import me.simple.dialog.show
import me.simple.dialog.showAllowingStateLoss
import me.simple.dialog.showNowAllowingStateLoss

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(this.layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)

        val context = this

        with(binding) {
            btnPDialog.setOnClickListener {
                PDialogImpl(context).show()
            }

            btnBottomDialog.setOnClickListener {
                BottomDialogImpl(context).show()
            }

            btnEditDialog.setOnClickListener {
                EditDialogImpl(context).show()
            }

            btnBottomEditDialog.setOnClickListener {
                BottomEditDialogImpl(context).show()
            }

            btnFullDialog.setOnClickListener {
                FullDialogImpl(context).show()
            }

            btnLoadingDialog.setOnClickListener {
                LoadingDialog(this@MainActivity).show()
            }

            //
            btnPDialogFragment.setOnClickListener {
                val dialog = PDialogFragmentImpl()
                dialog.showAllowingStateLoss(supportFragmentManager)

                dialog.dialog?.setOnShowListener {
                    showToast("OnShow")
                }
                dialog.dialog?.setOnDismissListener {
                    showToast("OnDismiss")
                }
                dialog.dialog?.setOnCancelListener {
                    showToast("OnCancel")
                }

            }

            btnEditDialogFragment.setOnClickListener {
                EditDialogFragmentImpl().showNowAllowingStateLoss(supportFragmentManager)
            }

            btnBottomDialogFragment.setOnClickListener {
                BottomDialogFragmentImpl().show(supportFragmentManager)
            }

            btnBottomEditDialogFragment.setOnClickListener {
                EditBottomDialogFragmentImpl().showNowAllowingStateLoss(supportFragmentManager)
            }

            btnFullDialogFragment.setOnClickListener {
                FullDialogFragmentImpl().show(supportFragmentManager)
            }
        }
    }

    private fun showToast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

}
