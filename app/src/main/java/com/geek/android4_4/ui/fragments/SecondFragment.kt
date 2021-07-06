package com.geek.android4_4.ui.fragments

import androidx.lifecycle.ViewModelProvider
import com.geek.android4_4.databinding.FragmentSecondBinding
import com.geek.android4_4.ui.SharedViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    private lateinit var viewModel: SharedViewModel

    override fun bindView(): FragmentSecondBinding {
        return FragmentSecondBinding.inflate(layoutInflater)
    }

    override fun init() {
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        observeListener()
    }

    private fun observeListener() {
        viewModel.count.observe(viewLifecycleOwner, {
            ui.tvCount.text = it.toString()
        })
    }
}