package xyz.calcugames.documake.dscanner

import xyz.calcugames.documake.dscanner.types.TypeData
import xyz.calcugames.documake.dscanner.types.Typed

/**
 * Represents a function in a programming language.
 */
data class Function(
    /**
     * The name of the function.
     */
    val name: String,
    /**
     * The parameters of the function.
     */
    val parameters: List<Parameter>,
    /**
     * The modifiers applied to the function.
     */
    val modifiers: List<Modifier>,
    /**
     * The return type of the function.
     */
    val returnType: ReturnType
)

/**
 * Represnets a parameter of a function.
 */
data class Parameter(
    /**
     * The name of the parameter.
     */
    val name: String,
    override val type: String,
    override val fullType: String,
    override val typeData: TypeData
) : Typed

/**
 * Represents the return type of the function.
 */
data class ReturnType(
    override val type: String,
    override val fullType: String,
    override val typeData: TypeData
) : Typed
