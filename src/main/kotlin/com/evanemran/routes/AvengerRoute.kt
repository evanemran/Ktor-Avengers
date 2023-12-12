package com.evanemran.routes

import com.evanemran.data.model.Avenger
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

//private const val BASE_URL = "http://localhost:8100" // local web
private const val BASE_URL = "http://192.168.0.238:8100" // local IP

private val avengers = listOf(
    Avenger("Black Widow","This is a test description","$BASE_URL/avengers/black-widow.jpg"),
    Avenger("Captain America","This is a test description","$BASE_URL/avengers/captain-america.jpg"),
    Avenger("Gamora","This is a test description","$BASE_URL/avengers/gamora.jpg"),
    Avenger("Spider-Man","This is a test description","$BASE_URL/avengers/spider-man.jpg"),
    Avenger("Thor","This is a test description","$BASE_URL/avengers/thor.jpg"),
)

fun Route.randomAvenger() {
    get(
        "/random-avenger"
    ) {
        call.respond(
            HttpStatusCode.OK,
            avengers.random()
        )
    }
}