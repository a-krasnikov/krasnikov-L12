package krasnikov.project.dialogexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import krasnikov.project.dialogexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val bottomSheetBehavior by lazy {
        BottomSheetBehavior.from(
            binding.root.findViewById(R.id.bottom_sheet)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupListeners()

        setupBottomSheet()
    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupListeners() {
        binding.btnShowAlert.setOnClickListener {
            showAlertDialog()
        }

        binding.btnShowDialog.setOnClickListener {
            showDialogFragment()
        }

        binding.btnShowBottomSheetXml.setOnClickListener {
            if (bottomSheetBehavior.state == BottomSheetBehavior.STATE_HIDDEN) {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        }

        binding.btnShowBottomSheetDF.setOnClickListener {
            showBottomSheetDialogFragment()
        }

    }

    private fun setupBottomSheet() {
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN
    }

    private fun showAlertDialog() {
        AlertDialog.Builder(this).setTitle(R.string.title_alert_dialog)
            .setMessage(R.string.msg_alert_dialog)
            .setPositiveButton(R.string.btn_ok) { _, _ ->
                Toast.makeText(this, "Ok clicked", Toast.LENGTH_SHORT).show()
            }.create().show()
    }

    private fun showDialogFragment() {
        MyDialogFragment().show(supportFragmentManager, "MyDialogFragment")
    }

    private fun showBottomSheetDialogFragment() {
        MyBottomSheetDialogFragment().show(
            supportFragmentManager,
            "MyBottomSheetDialogFragment"
        )
    }
}