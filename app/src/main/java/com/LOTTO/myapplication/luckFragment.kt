package com.LOTTO.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.LOTTO.myapplication.databinding.FragmentLuckBinding

class luckFragment : Fragment(R.layout.fragment_luck) {

    private var _binding: FragmentLuckBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentLuckBinding.bind(view)

    }
}