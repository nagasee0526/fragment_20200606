package com.ubis.fragment_20200606

import androidx.appcompat.app.AppCompatActivity

abstract  class baseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setValues()
    abstract fun setEvents()
}