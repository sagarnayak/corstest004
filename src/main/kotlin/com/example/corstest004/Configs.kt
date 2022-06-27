package com.example.corstest004

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.CorsRegistry
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.config.WebFluxConfigurer

//@Configuration
//@EnableWebFlux
//class Configs : WebFluxConfigurer {
//
//    override fun addCorsMappings(registry: CorsRegistry) {
//        registry
//            .addMapping("/**")
//            .allowedOrigins("https://stackoverflow.com")
//            .allowedMethods("*")
//            .allowedHeaders("*")
//            .maxAge(100)
//    }
//}