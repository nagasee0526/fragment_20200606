package com.ubis.fragment_20200606.flagments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ubis.fragment_20200606.R
import kotlinx.android.synthetic.main.fragment_third.*
import kotlinx.android.synthetic.main.gragment_first.*
import kotlinx.android.synthetic.main.gragment_first.messageTxt

class ThirdFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        messageTxt.text = "어서오세요"
    }

}