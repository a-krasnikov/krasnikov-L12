package krasnikov.project.dialogexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import krasnikov.project.dialogexample.databinding.FragmentMyDialogBinding

class MyDialogFragment : DialogFragment() {

    private lateinit var binding: FragmentMyDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListener()
    }

    private fun setupListener() {
        binding.btnPositive.setOnClickListener {
            Toast.makeText(requireContext(), "Ok clicked", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        binding.btnNegative.setOnClickListener {
            Toast.makeText(requireContext(), "Cancel clicked", Toast.LENGTH_SHORT).show()
            dismiss()
        }
    }
}