package com.geek.android4_4.ui.fragments

import androidx.lifecycle.ViewModelProvider
import com.geek.android4_4.databinding.FragmentThirdBinding
import com.geek.android4_4.ui.SharedViewModel

class ThirdFragment : BaseFragment<FragmentThirdBinding>() {

    private lateinit var viewModel: SharedViewModel

    override fun bindView(): FragmentThirdBinding {
        return FragmentThirdBinding.inflate(layoutInflater)
    }

    override fun init() {
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        observeListener()
    }

    private fun observeListener() {
        viewModel.commands.observe(viewLifecycleOwner, {
            ui.tvListOfCommand.text = it
        })
    }


}