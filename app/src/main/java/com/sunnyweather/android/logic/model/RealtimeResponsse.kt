package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class RealtimeResponsse (val status:String,val result:Result){
    data class AQI(val chn:Float)

    data class AirQuality(val aqi:AQI)

    data class Realtime(val skycon:String,val temperature:Float,@SerializedName("air_quality")val airquality:AirQuality)

    data class Result(val realtime:Realtime)
}