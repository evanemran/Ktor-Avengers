package com.evanemran.plugins

import com.evanemran.routes.randomAvenger
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        randomAvenger()
        // Static plugin. Try to access `/static/index.html`
        staticResources("/", "static")
    }
}
