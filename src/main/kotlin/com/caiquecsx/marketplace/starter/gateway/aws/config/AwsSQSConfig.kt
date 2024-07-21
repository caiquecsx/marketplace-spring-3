package com.caiquecsx.marketplace.starter.gateway.aws.config

import io.awspring.cloud.sqs.operations.SqsTemplate
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.sqs.SqsAsyncClient
import java.net.URI

@Configuration
class AwsSQSConfig(
    @Value("\${spring.cloud.aws.endpoint}")
    val endpoint: String,
    @Value("\${spring.cloud.aws.region.static}")
    val region: String,
    @Value("\${spring.cloud.aws.credentials.access-key}")
    val accessKey: String,
    @Value("\${spring.cloud.aws.credentials.secret-key}")
    val secretKey: String
) {
    @Bean
    fun sqsAsyncClient(): SqsAsyncClient = SqsAsyncClient
        .builder()
        .endpointOverride(URI.create(endpoint))
        .region(Region.of(region))
        .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKey, secretKey)))
        .build()


    @Bean
    fun sqsTemplate() = SqsTemplate
        .builder()
        .sqsAsyncClient(sqsAsyncClient())
        .build()
}