package com.lxq.weatherapp.http

import android.util.Log
import com.google.gson.Gson
import java.net.URL

/**
 * 请求类
 * Created by lxq on 2018/5/23.
 */
class Request(val zipCode: String) {

    fun run() {
        val forecastJsonStr = URL(zipCode).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }

    companion object {
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/" +
                "forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
    }

    fun execute(): Request {
        val forecastJsonStr = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(forecastJsonStr, Request::class.java)
    }
}