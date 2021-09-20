package com.suellen.routes

import com.suellen.data.model.Rabbit
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "http://IP:8080"  // "http://IP:PORT" localhost example declaration

private val rabbits = listOf(
    Rabbit(name = "Fernando", description = "He likes to sleep", imageUrl = " $BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit(name = "Maria", description = "Maria likes to run", imageUrl = " $BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit(name = "Rafael", description = "Rafael likes to eat peaches", imageUrl = " $BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit(name = "Renata", description = "Renata prefers the winter", imageUrl = " $BASE_URL/rabbits/rabbit4.jpg")
)

fun Route.randomRabbit() {
    get(path = "random-rabbit") {
        // call.parameters["rabbitId"] - Example on how to add query parameters
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}