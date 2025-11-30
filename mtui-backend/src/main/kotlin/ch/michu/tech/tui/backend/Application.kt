package ch.michu.tech.tui.backend

import ch.michu.tech.tui.core.TuiCore
import ch.michu.tech.tui.core.init

/*
- Provide HTTP POST endpoint for command sending
- Provide HTTP GET endpoinit for Autocomplete (one time)
- provide Websocket Connection for Autocomplete (live)
*/

object TuiBackend {
    private var setup = false

    fun setup() {
        if(setup) {
            throw IllegalStateException("tui backend is already setup.")
        }

        TuiCore.init(TODO("implement (maybe with option for automatic reflection)"))
    }
}