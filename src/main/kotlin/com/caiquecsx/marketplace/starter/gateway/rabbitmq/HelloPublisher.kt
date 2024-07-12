package com.caiquecsx.marketplace.starter.gateway.rabbitmq

import org.springframework.cloud.stream.function.StreamBridge
import org.springframework.messaging.support.MessageBuilder
import org.springframework.stereotype.Component

@Component
class HelloPublisher(val streamBridge: StreamBridge) {
    fun execute() {
        val message = MessageBuilder.withPayload("Testing async message").build();
        streamBridge.send("hello-source-event-output", message)
    }
}