package com.sensordrive.inverter


import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BunnyApplication : Application()
{
    override fun onCreate()
    {
        super.onCreate()
        Log.i("BunnyApplication", "onCreate")
    }

    override fun onLowMemory()
    {
        super.onLowMemory()
        Log.i("BunnyApplication", "onLowMemory")
    }
}