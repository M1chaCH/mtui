plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.ktor)
    alias(libs.plugins.kotlin.plugin.serialization)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(path = ":mtui-core", configuration = "default"))

//    TODO - these dependencies can most likely be stripped to the minimal required set. also properly decide what to mark as API and what should be implementation
    api(libs.ktor.server.task.scheduling.core)
    api(libs.ktor.server.task.scheduling.redis)
    api(libs.ktor.server.task.scheduling.mongodb)
    api(libs.ktor.server.task.scheduling.jdbc)
    api(libs.ktor.server.core)
    api(libs.ktor.server.websockets)
    api(libs.koin.ktor)
    api(libs.koin.logger.slf4j)
    api(libs.ktor.serialization.kotlinx.json)
    api(libs.ktor.server.content.negotiation)
    api(libs.h2)
    api(libs.exposed.core)
    api(libs.exposed.jdbc)
    api(libs.ktor.server.metrics)
    api(libs.ktor.server.call.logging)
    api(libs.ktor.server.call.id)
    api(libs.ktor.server.caching.headers)
    api(libs.ktor.server.compression)
    api(libs.ktor.server.cors)
    api(libs.ktor.server.netty)
    api(libs.logback.classic)
    api(libs.ktor.server.config.yaml)

    testImplementation(libs.ktor.server.test.host)
    testImplementation(libs.kotlin.test.junit)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}