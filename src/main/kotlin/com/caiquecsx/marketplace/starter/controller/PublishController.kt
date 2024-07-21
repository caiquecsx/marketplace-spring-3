package com.caiquecsx.marketplace.starter.controller

import com.caiquecsx.marketplace.starter.controller.api.PublishApi
import com.caiquecsx.marketplace.starter.gateway.aws.sqs.LocalQueuePublisher
import com.caiquecsx.marketplace.starter.gateway.rabbitmq.HelloPublisher
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class PublishController(
    val helloPublisher: HelloPublisher,
    val localQueuePublisher: LocalQueuePublisher
): PublishApi {

    override fun execute(): ResponseEntity<Any> {
        helloPublisher.execute()
        localQueuePublisher.execute()
        return ResponseEntity.ok().build()
    }
}