package com.caiquecsx.marketplace.starter.gateway.aws.sqs

import io.awspring.cloud.sqs.operations.SqsTemplate
import org.springframework.stereotype.Component

@Component
class LocalQueuePublisher(
    private val sqsTemplate: SqsTemplate
) {
    fun execute() {
        sqsTemplate.send("local-queue", "Sending SQS message")
    }
}