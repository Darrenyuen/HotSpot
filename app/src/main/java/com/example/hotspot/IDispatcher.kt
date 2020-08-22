package com.example.hotspot

import android.os.Bundle

/**
 *yuan
 *2020/8/21
 **/
interface IDispatcher {

    fun onCreate()

    fun onCreateView(bundle: Bundle?)

    fun onResume()

    fun onDestroy()
}