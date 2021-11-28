package demo.simple.pdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import demo.simple.pdialog.dialog_fragment_impl.BottomDialogFragmentImpl
import demo.simple.pdialog.dialog_fragment_impl.FullScreenDialogFragmentImpl
import demo.simple.pdialog.databinding.ActivityMainBinding
import demo.simple.pdialog.dialog_fragment_impl.PDialogFragmentImpl
import demo.simple.pdialog.dialog_impl.*
import me.simple.dialog.PDialogFragment

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
                EditNiceDialogImpl(context).show()
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
            btnNiceBottomDialogFragment.setOnClickListener {
                BottomDialogFragmentImpl().show(supportFragmentManager)
            }
            btnNiceFullScreenDialogFragment.setOnClickListener {
                FullScreenDialogFragmentImpl().show(supportFragmentManager)
            }
        }
    }

}
