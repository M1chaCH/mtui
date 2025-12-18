package ch.michu.tech.tui.backend

import io.ktor.http.CacheControl
import io.ktor.http.ContentType
import io.ktor.http.HttpMethod
import io.ktor.http.content.CachingOptions
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.cachingheaders.CachingHeaders
import io.ktor.server.plugins.compression.Compression
import io.ktor.server.plugins.cors.routing.CORS

fun Application.configureHTTP() {
    install(CachingHeaders) { // TODO specific caching? css is probably not used.
        options { call, outgoingContent ->
            when (outgoingContent.contentType?.withoutParameters()) {
                ContentType.Text.CSS -> CachingOptions(CacheControl.MaxAge(maxAgeSeconds = 24 * 60 * 60))
                else -> null
            }
        }
    }
    install(Compression)
    install(CORS) {
        allowMethod(HttpMethod.Options)
        allowMethod(HttpMethod.Post)
//        allowHeader(HttpHeaders.Authorization) // TODO must be configurable by project
        anyHost() // @TODO: Don't do this in production if possible. Try to limit it.
    }
}