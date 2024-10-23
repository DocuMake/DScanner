package xyz.calcugames.documake.dscanner

/**
 * Represents a modifier for an element in a programming language.
 */
data class Modifier(
    /**
     * The name of the modifier. This may or may not reflect the actual name of the modifier in the source code.
     */
    val name: String
)

object Modifiers {

    /**
     * Represents the `public` modifier to indicate that an element is public.
     */
    val PUBLIC = Modifier("public")

    /**
     * Represents the `protected` modifier to indicate that an element is protected.
     */
    val PROTECTED = Modifier("protected")

    /**
     * Represents the `private` modifier to indicate that an element is private.
     */
    val PRIVATE = Modifier("private")

    /**
     * Represents the `internal` modifier to indicate that an element is internal.
     */
    val INTERNAL = Modifier("internal")

    /**
     * Represents the `static` modifier to indicate that an element is static.
     */
    val STATIC = Modifier("static")

    /**
     * Represents the `transient` modifier to indicate that an element is transient.
     */
    val TRANSIENT = Modifier("transient")

    /**
     * Represents the `final` modifier to indicate that an element is final.
     */
    val FINAL = Modifier("final")

    /**
     * Represents the `abstract` modifier to indicate that an element is abstract.
     */
    val ABSTRACT = Modifier("abstract")

    /**
     * Represents the `synchronized` modifier to indicate that an element is synchronized.
     */
    val SYNCHRONIZED = Modifier("synchronized")

    /**
     * Represents the `volatile` modifier to indicate that an element is volatile.
     */
    val VOLATILE = Modifier("volatile")

    /**
     * Represents the `record` modifier, which is used in Java to indicate that an element is a record.
     */
    val RECORD = Modifier("record")

    /**
     * Represents the `native` modifier to indicate that an element is implemented on native.
     */
    val NATIVE = Modifier("native")

    /**
     * Represents the `external` modifier to indicate that an element is implemented externally.
     */
    val EXTERNAL = Modifier("external")

    /**
     * Represents the `expect` modifier, which is used in Kotlin Multiplatform to indicate that an element is expected to be implemented in platform-specific code.
     */
    val EXPECT = Modifier("expect")

    /**
     * Represents the `actual` modifier, which is used in Kotlin Multiplatform to indicate that an element is the actual implementation of an expected element.
     */
    val ACTUAL = Modifier("actual")

    /**
     * Represents the `inline` modifier to indicate that an element is inlined.
     */
    val INLINE = Modifier("inline")

    /**
     * Represents the `crossinline` modifier, which is used in Kotlin to indicate that a lambda parameter should not allow non-local returns.
     */
    val CROSSINLINE = Modifier("crossinline")

    /**
     * Represents the `noinline` modifier, which is used in Kotlin to indicate that a lambda parameter should not be inlined.
     */
    val NOINLINE = Modifier("noinline")

    /**
     * Represents the `reified` modifier, which is used in Kotlin to indicate that a type parameter should be reified at runtime.
     */
    val REIFIED = Modifier("reified")

    /**
     * Represents the `operator` modifier, which is used in Kotlin to indicate that a function is an operator.
     */
    val OPERATOR = Modifier("operator")

    /**
     * Represents the `infix` modifier, which is used in Kotlin to indicate that a function is an infix function.
     */
    val INFIX = Modifier("infix")

    /**
     * Represents the `override` modifier to indicate that an element is overriding a superclass element.
     */
    val OVERRIDE = Modifier("override")

    /**
     * Represents the `open` modifier to indicate that an element is open for subclassing.
     */
    val OPEN = Modifier("open")

    /**
     * Represents the `sealed` modifier to indicate that an element is a sealed class.
     */
    val SEALED = Modifier("sealed")

    /**
     * Represents the `data` modifier to indicate that an element is a data class.
     */
    val DATA = Modifier("data")

    /**
     * Represents the `inner` modifier to indicate that an element is an inner class.
     */
    val INNER = Modifier("inner")

    /**
     * Represents the `enum` modifier to indicate that an element is an enum class.
     */
    val ENUM = Modifier("enum")

    /**
     * Represents the `annotation` modifier to indicate that an element is an annotation class.
     */
    val ANNOTATION = Modifier("annotation")

    /**
     * Represents the `class` modifier to indicate that an element is a class.
     */
    val CLASS = Modifier("class")

    /**
     * Represents the `interface` modifier to indicate that an element is an interface.
     */
    val INTERFACE = Modifier("interface")

    /**
     * Represents the `object` modifier to indicate that an element is an object.
     */
    val OBJECT = Modifier("object")

    /**
     * Represents the `companion` modifier, which is used in Kotlin to indicate that an element is a companion object.
     */
    val COMPANION = Modifier("companion")

    /**
     * Represents the `typedef` modifier, which is used in C and C++ to indicate that an element is a type definition.
     */
    val TYPEDEF = Modifier("typedef")

    /**
     * Represents the `using` modifier, which is used in C# to indicate that an element is a using directive.
     */
    val USING = Modifier("using")

    /**
     * Represents the `namespace` modifier, which is used in C++ and C# to indicate that an element is a namespace.
     */
    val NAMESPACE = Modifier("namespace")

    /**
     * Represents the `unsigned` modifier, which is used in C and C++ to indicate that an element is an unsigned type.
     */
    val UNSIGNED = Modifier("unsigned")

    /**
     * Represents the `signed` modifier, which is used in C and C++ to indicate that an element is a signed type.
     */
    val SIGNED = Modifier("signed")

    /**
     * Represents the `const` modifier, which is used to indicate that an element is a constant.
     */
    val CONST = Modifier("const")

    /**
     * Represents the `mutable` modifier to indicate that an element is mutable.
     */
    val MUTABLE = Modifier("mutable")

    /**
     * Represents the `readonly` modifier to indicate that an element is read-only.
     */
    val READONLY = Modifier("readonly")

    /**
     * Represents the `restrict` modifier, which is used in C and C++ to indicate that a pointer is restricted.
     */
    val RESTRICT = Modifier("restrict")

    /**
     * Represents the `virtual` modifier to indicate that an element is virtual and can be overridden.
     */
    val VIRTUAL = Modifier("virtual")

    /**
     * Represents the `async` modifier to indicate that an element is asynchronous.
     */
    val ASYNC = Modifier("async")

    /**
     * Represents the `function` modifier to indicate that an element is a function.
     */
    val FUNCTION = Modifier("function")

    /**
     * Represents the `vararg` modifier, which is used to indicate a dynamic number of arguments in a function.
     */
    val VARARG = Modifier("vararg")

    /**
     * Represents the `property` modifier to indicate that an element is a property.
     */
    val PROPERTY = Modifier("property")
}