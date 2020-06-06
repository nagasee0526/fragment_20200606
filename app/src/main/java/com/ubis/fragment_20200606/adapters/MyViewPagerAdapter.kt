package com.ubis.fragment_20200606.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ubis.fragment_20200606.flagments.FirstFlagment
import com.ubis.fragment_20200606.flagments.SecondFlagment
import com.ubis.fragment_20200606.flagments.ThirdFragment

class MyViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        if( position == 0 ) return FirstFlagment()
        else if( position == 1) return SecondFlagment()
        else return ThirdFragment()
    }

    override fun getCount(): Int { // 몊페이지 인지
        return 3
    }
}