package com.ubis.fragment_20200606.flagments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.*
import androidx.fragment.app.Fragment
import com.ubis.fragment_20200606.R
import kotlinx.android.synthetic.main.gragment_first.*

class SecondFlagment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        messageTxt.text = "안녕히가세요"
    }

}