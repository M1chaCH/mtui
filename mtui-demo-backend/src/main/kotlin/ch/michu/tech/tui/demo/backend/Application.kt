package ch.michu.tech.tui.demo.backend

import ch.michu.tech.tui.backend.TuiBackend
import io.ktor.server.application.Application

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
//    APP
//    configureDependencyInjection()

//    WEB (TODO)
//    configureMonitoring()
//    configureSecurity()
//    configureHTTP()
//    configureRouting()
//    configureSockets()

    TuiBackend.setup()
}