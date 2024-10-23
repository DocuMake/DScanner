package xyz.calcugames.documake.dscanner.parser.kotlin

import xyz.calcugames.documake.dscanner.Modifier
import xyz.calcugames.documake.dscanner.Modifiers
import xyz.calcugames.documake.dscanner.parser.ModifierStorage

/**
 * Represents the modifiers in the Kotlin programming language.
 */
object KotlinModifierStorage : ModifierStorage({
    registerVisibility()
    create(Modifiers.PROTECTED)
    create(Modifiers.INTERNAL)

    registerOop()
    create(Modifiers.DATA)
    create(Modifiers.COMPANION)
    create(Modifiers.ANNOTATION)

    create(Modifiers.INLINE)
    create(Modifiers.INFIX)
    create(Modifiers.OPERATOR)
    create(Modifiers.CROSSINLINE)
    create(Modifiers.NOINLINE)
    create(Modifiers.VARARG)
})