package com.example.corstest004

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.CorsRegistry
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.config.WebFluxConfigurer

@Configuration
@EnableWebFlux
class Configs : WebFluxConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry
            .addMapping("/**")
            .allowedOrigins(
                "https://stackoverflow.com",
                "https://www.google.com",
                "http://localhost:4200",
                "https://00eb-122-163-116-4.ngrok.io"
            )
            .allowedMethods("GET", "POST", "OPTIONS", "HEAD")
    }
}