package com.sunnyweather.android

import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {
        lateinit var context: Context
        const val TOKEN = "15thF5IDoJHIdtX8"
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }

}