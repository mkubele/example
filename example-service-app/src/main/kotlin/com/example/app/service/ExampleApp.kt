package com.example.app.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExampleApp

fun main(args: Array<String>) {
    runApplication<ExampleApp>(*args)
}
