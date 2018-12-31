package com.example.demo

import com.alibaba.fastjson.JSONObject

data class StatesMessage @JvmOverloads constructor(val command: String = "states", var states: States = States()) {

    fun toJsonString(): String {
        return JSONObject.toJSONString(this)
    }

    data class States(var x: Double = 0.0, var y: Double = 0.0)
}