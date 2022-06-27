package com.example.corstest004

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.Serializable
import java.util.*

@CrossOrigin(origins = ["https://stackoverflow.com"])
@RestController
@RequestMapping("/")
class ControllerOne {

    @GetMapping
    fun getOne(): GenericResponse {
        return GenericResponse(message = UUID.randomUUID().toString())
    }
}

data class GenericResponse(
    var message: String = "",
) : Serializable