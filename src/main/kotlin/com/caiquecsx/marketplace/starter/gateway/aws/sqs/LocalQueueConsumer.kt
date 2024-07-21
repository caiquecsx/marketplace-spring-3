package com.caiquecsx.marketplace.starter.gateway.aws.sqs

import com.caiquecsx.marketplace.starter.config.log
import io.awspring.cloud.sqs.annotation.SqsListener
import org.springframework.stereotype.Component

@Component
class LocalQueueConsumer {
    @SqsListener("\${events.queues.local-queue}")
    fun execute(message: String) {
        log.info(message)
    }
}