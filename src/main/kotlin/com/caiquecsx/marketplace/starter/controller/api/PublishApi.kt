package com.caiquecsx.marketplace.starter.controller.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus

@RequestMapping("/publish")
interface PublishApi {
    @GetMapping
    fun execute(): ResponseEntity<Any>
}