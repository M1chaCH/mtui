package ch.michu.tech.tui.core.definition

import ch.michu.tech.tui.core.explain.SelfDescribingNode

data class OptionDefinition(override val name: String,
                            override val description: String)
    : SelfDescribingNode {
}