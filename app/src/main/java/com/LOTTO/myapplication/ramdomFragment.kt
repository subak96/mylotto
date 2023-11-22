package com.LOTTO.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.LOTTO.myapplication.databinding.FragmentRamdomBinding

class ramdomFragment : Fragment(R.layout.fragment_ramdom) {

    private var _binding: FragmentRamdomBinding? = null
    private val binding get() = _binding!!
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        _binding = FragmentRamdomBinding.bind(view)

    }
}