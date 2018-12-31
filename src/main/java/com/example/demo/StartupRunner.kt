package com.example.demo

import com.alibaba.fastjson.JSON
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

        val s = "{\"states\":{\"x\":5.0,\"y\":5.0,\"yaw\":1.57,\"battery\": 0.56, \"error\": 0.0},\"command\":\"states\"}"

        val state1 = JSON.parseObject(s, StatesMessage1::class.java)
        logger.info(state1)

        val state = JSON.parseObject(s, StatesMessage::class.java)
        logger.info(state.states.x)
        logger.info(state.states.y)

    }
}

