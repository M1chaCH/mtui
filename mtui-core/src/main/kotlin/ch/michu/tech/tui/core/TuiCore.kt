package ch.michu.tech.tui.core

import ch.michu.tech.tui.core.definition.DirectoryDefinition
import ch.michu.tech.tui.core.runtime.ExecutableLinkedList

object TuiCore {
    private var rootDir: DirectoryDefinition? = null

    fun initialize(rootDirectory: DirectoryDefinition) {
        if(rootDir == null) {
            throw IllegalStateException("Cannot initialize Tui Directories twice. (root already initialized)")
        }

        rootDir = rootDirectory
    }

    fun parse(input: String) : ExecutableLinkedList? {
        return null
    }

    fun autoComplete(input: String) : List<String> {
        return listOf()
    }
}