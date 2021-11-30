package demo.simple.pdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import demo.simple.pdialog.databinding.ActivityMainBinding
import demo.simple.pdialog.dialog_fragment_impl.*
import demo.simple.pdialog.dialog_impl.*

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
                EditBottomDialogImpl(context).show()
            }

            btnFullDialog.setOnClickListener {
                FullScreenDialogImpl(context).show()
            }

            //
            btnPDialogFragment.setOnClickListener {
                PDialogFragmentImpl().showAllowingStateLoss(supportFragmentManager)
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

            btnFullScreenDialogFragment.setOnClickListener {
                FullScreenDialogFragmentImpl().show(supportFragmentManager)
            }
        }
    }

}
