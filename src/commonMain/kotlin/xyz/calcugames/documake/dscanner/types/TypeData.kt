package xyz.calcugames.documake.dscanner.types

import kotlin.reflect.KClass

/**
 * Represents information about a type.
 */
data class TypeData(
    /**
     * Whether this type is a number in its native language.
     */
    val isNumber: Boolean,
    /**
     * Whether this type is a void type, meaning it has no value.
     */
    val isVoid: Boolean,
    /**
     * The type's maximum bit size, or `-1` if it has a dynamic size.
     */
    val maxBitSize: Int,
    /**
     * The name of the type in Kotlin, if it exists.
     */
    val kotlinType: KClass<*>? = null
)