package com.example.demo

import com.alibaba.fastjson.JSON
import com.google.gson.Gson
import org.apache.logging.log4j.LogManager
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class StartupRunner : CommandLineRunner {

    private val logger = LogManager.getLogger(StartupRunner::class.java)

    override fun run(vararg args: String) {

        val statesMessage = StatesMessage()
        statesMessage.states.x = 1.0
        statesMessage.states.y = 1.0
        logger.info(statesMessage.toJsonString())

        val s = "{\"states\":{\"x\":5.0,\"y\":5.0},\"command\":\"states\"}"


        val state1 = JSON.parseObject(s, StatesMessage1::class.java)
        logger.info(state1)

        /* it will throw exception
        val state = JSON.parseObject(s, StatesMessage::class.java)
        */
        val state = Gson().fromJson(s, StatesMessage::class.java)
        logger.info(state.states.x)
        logger.info(state.states.y)

    }
}

