package com.example.docker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class DockerApplication

fun main(args: Array<String>) {
    runApplication<DockerApplication>(*args)
}
