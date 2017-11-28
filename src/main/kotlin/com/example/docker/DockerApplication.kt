package com.example.docker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class DockerApplication

fun main(args: Array<String>) {
    println("我启动了!!")
    runApplication<DockerApplication>(*args)
}
