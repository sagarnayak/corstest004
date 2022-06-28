package com.example.corstest004

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.Serializable
import java.util.*

/**
 * tried adding the cross-origin headers. but only post method is working.
 * get method is still showing error.
 */

@RestController
@RequestMapping("/data")
class ControllerOne {

    @GetMapping("/get")
//    @CrossOrigin(origins = ["*"], methods = [RequestMethod.GET])
    fun getOne(): GenericResponse {
        return GenericResponse(message = UUID.randomUUID().toString())
    }

    @PostMapping
//    @CrossOrigin(origins = ["*"], methods = [RequestMethod.POST])
    fun postOne(): GenericResponse {
        return GenericResponse(message = UUID.randomUUID().toString())
    }
}

data class GenericResponse(
    var message: String = "",
) : Serializable