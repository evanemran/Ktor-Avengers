package com.evanemran.routes

import com.evanemran.data.model.Avenger
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

//private const val BASE_URL = "http://localhost:8100" // local web
//private const val BASE_URL = "http://192.168.0.238:8100" // local IP
private const val BASE_URL = "http://128.199.180.160:8100" // live IP

private val avengers = listOf(
    Avenger("Black Widow","This is a test description","$BASE_URL/avengers/black-widow.jpg"),
    Avenger("Captain America","This is a test description","$BASE_URL/avengers/captain-america.jpg"),
    Avenger("Gamora","This is a test description","$BASE_URL/avengers/gamora.jpg"),
    Avenger("Spider-Man","This is a test description","$BASE_URL/avengers/spider-man.jpg"),
    Avenger("Thor","This is a test description","$BASE_URL/avengers/thor.jpg"),
    Avenger("Iron Man","This is a test description","https://w0.peakpx.com/wallpaper/260/63/HD-wallpaper-iron-man-avengers-ironman-marvel.jpg"),
    Avenger("Yo Yo Thanos","This is a test description","https://w0.peakpx.com/wallpaper/220/465/HD-wallpaper-thanos-avengers-avengers-infinity-war-cool-dslr-king-snapseed.jpg"),
    Avenger("Black Panther","This is a test description","https://w0.peakpx.com/wallpaper/28/243/HD-wallpaper-black-panther-avengers-dark-infinity-logo-marvel-war.jpg"),
    Avenger("Hulk","This is a test description","https://w0.peakpx.com/wallpaper/549/729/HD-wallpaper-hulk-avenger.jpg"),
    Avenger("Groot","This is a test description","https://w0.peakpx.com/wallpaper/611/873/HD-wallpaper-groot-amoled-wall-amoled-avengers-groot-marvel.jpg"),
    Avenger("Avenger Gauntlet","This is a test description","https://w0.peakpx.com/wallpaper/360/875/HD-wallpaper-avengers-assemble-avengers-avengers-endgame-avengers-infinity-war-black-widow-captain-america-hulk-infinity-stones-iron-man-thanos-thor.jpg"),
    Avenger("Avengers","This is a test description","https://w0.peakpx.com/wallpaper/787/97/HD-wallpaper-avengers-endgame-avengers-endgame.jpg"),
    Avenger("Iron Man","This is a test description","https://assets.hongkiat.com/uploads/marvel-wallpapers/mobile/preview/marvel-mobile-wallpaper-13.jpg"),
    Avenger("Avengers","This is a test description","https://assets.hongkiat.com/uploads/marvel-wallpapers/mobile/preview/marvel-mobile-wallpaper-1.jpg"),
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

fun Route.allAvenger() {
    get(
        "/all-avengers"
    ) {
        call.respond(
            HttpStatusCode.OK,
            avengers
        )
    }
}