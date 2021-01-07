package krasnikov.project.dialogexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import krasnikov.project.dialogexample.databinding.FragmentMyBottomSheetDialogBinding

class MyBottomSheetDialogFragment : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentMyBottomSheetDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyBottomSheetDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

}