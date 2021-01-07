package krasnikov.project.dialogexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
}