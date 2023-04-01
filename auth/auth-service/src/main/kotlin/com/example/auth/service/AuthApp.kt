package com.example.auth.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AuthApp

fun main(args: Array<String>) {
    SpringApplication(AuthApp::class.java).run(*args)
}
