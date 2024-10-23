package xyz.calcugames.documake.dscanner.parser.java

import xyz.calcugames.documake.dscanner.Modifiers
import xyz.calcugames.documake.dscanner.parser.ModifierStorage

/**
 * Represents a map of modifiers for an element in a Java programming language.
 */
object JavaModifierStorage : ModifierStorage({
    registerOop()
    create(Modifiers.RECORD)
    create(Modifiers.ANNOTATION)

    registerVisibility()
    create(Modifiers.PROTECTED)

    create(Modifiers.STATIC)
    create(Modifiers.TRANSIENT)
    create(Modifiers.NATIVE)
})