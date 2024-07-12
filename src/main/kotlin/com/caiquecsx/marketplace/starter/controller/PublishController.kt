package com.caiquecsx.marketplace.starter.controller

import com.caiquecsx.marketplace.starter.controller.api.PublishApi
import com.caiquecsx.marketplace.starter.gateway.rabbitmq.HelloPublisher
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class PublishController(val helloPublisher: HelloPublisher): PublishApi {

    override fun execute(): ResponseEntity<Any> {
        helloPublisher.execute()
        return ResponseEntity.ok().build()
    }
}