package xyz.calcugames.documake.dscanner.types

/**
 * Represents common types of elements in various programming languages.
 */
object Types {

    /**
     * Represents a dynamic type from a programming language that does not have explicit types.
     */
    val DYNAMIC = TypeData(
        isNumber = false,
        isVoid = false,
        maxBitSize = -1,
        Any::class
    )

    /**
     * Represents a [String] type.
     */
    val STRING = TypeData(
        isNumber = false,
        isVoid = false,
        maxBitSize = -1,
        String::class
    )

    /**
     * Represents a [Char] type.
     */
    val CHAR = TypeData(
        isNumber = false,
        isVoid = false,
        maxBitSize = 16,
        Char::class
    )

    /**
     * Represents an 8-bit integer type, also known as a [Byte].
     */
    val INT_8 = TypeData(
        isNumber = true,
        isVoid = false,
        maxBitSize = 8,
        Byte::class
    )

    /**
     * Represents a 16-bit integer type, also known as a [Short].
     */
    val INT_16 = TypeData(
        isNumber = true,
        isVoid = false,
        maxBitSize = 16,
        Short::class
    )

    /**
     * Represents a 32-bit integer type, also known as an [Int].
     */
    val INT_32 = TypeData(
        isNumber = true,
        isVoid = false,
        maxBitSize = 32,
        Int::class
    )

    /**
     * Represents a 64-bit integer type, also known as a [Long].
     */
    val INT_64 = TypeData(
        isNumber = true,
        isVoid = false,
        maxBitSize = 64,
        Long::class
    )

    /**
     * Represents a 32-bit floating-point type, also known as a [Float].
     */
    val FLOAT_32 = TypeData(
        isNumber = true,
        isVoid = false,
        maxBitSize = 32,
        Float::class
    )

    /**
     * Represents a 64-bit floating-point type, also known as a [Double].
     */
    val FLOAT_64 = TypeData(
        isNumber = true,
        isVoid = false,
        maxBitSize = 64,
        Double::class
    )

}