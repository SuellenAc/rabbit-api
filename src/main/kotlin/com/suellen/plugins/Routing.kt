package com.suellen.plugins

import com.suellen.routes.randomRabbit
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {
    routing {
        randomRabbit()
        static {
            resources("static")
        }
    }
}
