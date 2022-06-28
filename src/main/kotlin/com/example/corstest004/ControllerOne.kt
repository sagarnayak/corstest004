package com.example.corstest004

import org.springframework.web.bind.annotation.*
import java.io.Serializable
import java.util.*

/**
 * tried adding the cross-origin headers. but only post method is working.
 * get method is still showing error.
 */

//@CrossOrigin(origins = ["https://stackoverflow.com"])
@RestController
@RequestMapping("/data")
class ControllerOne {

    @GetMapping
    fun getOne(): GenericResponse {
        return GenericResponse(message = UUID.randomUUID().toString())
    }

    @PostMapping
    fun postOne(): GenericResponse {
        return GenericResponse(message = UUID.randomUUID().toString())
    }
}

data class GenericResponse(
    var message: String = "",
) : Serializable