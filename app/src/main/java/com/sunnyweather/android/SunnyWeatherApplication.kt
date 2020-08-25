package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication:Application() {

    companion object {
        //全局只有一个context静态变量
        lateinit var context:Context
        //天气令牌
        const val TOKEN = "IIn98YpKe08WjEO6"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}