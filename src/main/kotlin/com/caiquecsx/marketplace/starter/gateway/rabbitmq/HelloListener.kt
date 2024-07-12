package com.caiquecsx.marketplace.starter.gateway.rabbitmq

import com.caiquecsx.marketplace.starter.config.log
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Consumer

@Configuration
class HelloListener {

    @Bean(name = ["hello-source-event-input"])
    fun helloSourceEventInput(): Consumer<String> {
        return Consumer { message ->
            log.info("Received message $message")
        }
    }
}