package com.lxq.weatherapp.bean

/**
 * Created by lxq on 2018/5/23.
 */
class Domain {
    data class ForecastList(val city: String, val country: String,
                            val dailyForecast: List<Forecast>)

    data class Forecast(val date: String, val description: String, val high: Int,
                        val low: Int)
}