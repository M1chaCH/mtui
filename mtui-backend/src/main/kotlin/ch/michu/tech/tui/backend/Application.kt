package ch.michu.tech.tui.backend

import ch.michu.tech.tui.core.TuiCore
import ch.michu.tech.tui.core.init
import io.ktor.server.application.Application

/*
- Provide HTTP POST endpoint for command sending
- Provide HTTP GET endpoinit for Autocomplete (one time)
- provide Websocket Connection for Autocomplete (live)
*/

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.setupTuiBackend() {
    configureHTTP()
    configureRouting()
}

object TuiBackend {
    private var setup = false

    fun setup() {
        if(setup) {
            throw IllegalStateException("tui backend is already setup.")
        }

        TuiCore.init(TODO("implement (maybe with option for automatic reflection)"))
    }
}