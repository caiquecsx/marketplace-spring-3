package com.caiquecsx.marketplace.starter.controller

import com.caiquecsx.marketplace.starter.controller.api.ExampleApi
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController: ExampleApi {
    override fun execute(): ResponseEntity<String> {
        return ResponseEntity.ok("REST Tested")
    }
}