package com.caiquecsx.marketplace.starter.controller.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/example")
interface ExampleApi {
    @GetMapping
    fun execute(): ResponseEntity<String>
}