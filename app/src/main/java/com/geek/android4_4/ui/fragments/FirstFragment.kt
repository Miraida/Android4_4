package com.geek.android4_4.ui.fragments

import androidx.lifecycle.ViewModelProvider
import com.geek.android4_4.databinding.FragmentFirstBinding
import com.geek.android4_4.ui.SharedViewModel

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    private lateinit var viewModel: SharedViewModel

    override fun bindView(): FragmentFirstBinding {
         return FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun init() {
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        setupListeners()
    }

    private fun setupListeners() {
        ui.btnPlus.setOnClickListener {
            viewModel.plus()
        }
        ui.btnMinus.setOnClickListener {
            viewModel.minus()
        }
    }

}