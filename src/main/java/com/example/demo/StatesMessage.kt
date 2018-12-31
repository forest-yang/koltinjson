package com.example.demo

import com.alibaba.fastjson.JSONObject

data class StatesMessage @JvmOverloads constructor(var command: String = "states",
                                                   var states: States = States(x=3.0,y=3.0)) {

    fun toJsonString(): String {
        return JSONObject.toJSONString(this)
    }

    data class States(var x: Double = 0.0, var y: Double = 0.0)
}