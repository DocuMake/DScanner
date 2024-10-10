package xyz.calcugames.documake.dscanner.types

/**
 * Represents an element with a type.
 */
interface Typed {

    /**
     * The type as displayed in the native language.
     */
    val type: String

    /**
     * The full name of the type including any generics or other type information as displayed in the native language.
     */
    val fullType: String

    /**
     * The data for the specified type.
     */
    val typeData: TypeData
}