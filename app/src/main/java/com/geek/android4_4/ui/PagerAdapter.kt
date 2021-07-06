package com.geek.android4_4.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.geek.android4_4.ui.fragments.FirstFragment
import com.geek.android4_4.ui.fragments.SecondFragment
import com.geek.android4_4.ui.fragments.ThirdFragment

class PagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return FirstFragment()
        }
        if (position == 1) {
            return SecondFragment()
        }
        return if (position == 2) {
            ThirdFragment()
        } else {
            FirstFragment()
        }
    }

}