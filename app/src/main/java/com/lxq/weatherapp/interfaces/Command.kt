package com.lxq.weatherapp.interfaces

/**
 * Created by lxq on 2018/5/23.
 */
interface Command<T> {
    fun execute(): T
}