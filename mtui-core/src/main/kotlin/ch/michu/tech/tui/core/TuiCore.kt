package ch.michu.tech.tui.core

import ch.michu.tech.tui.core.definition.DirectoryDefinition
import ch.michu.tech.tui.core.runtime.ExecutableLinkedList
import kotlin.reflect.KProperty

object TuiCore {
    var rootDir: DirectoryDefinition by TuiRootDirectoryInitializer()

    fun parse(input: String) : ExecutableLinkedList? {
        return null
    }

    fun autoComplete(input: String) : List<String> {
        return listOf()
    }
}

fun TuiCore.init(rootDir: DirectoryDefinition) {
    this.rootDir = rootDir
}

private class TuiRootDirectoryInitializer() {
    private var dir: DirectoryDefinition? = null

    operator fun getValue(thisRef: TuiCore, property: KProperty<*>): DirectoryDefinition {
        return dir ?: throw IllegalStateException("Cannot access root directory before initializing Tui Directories.")
    }

    operator fun setValue(thisRef: TuiCore, property: KProperty<*>, value: DirectoryDefinition) {
        if(dir != null) {
            throw IllegalStateException("Cannot change root directory after initializing Tui Directories.")
        }

        dir = value
    }
}