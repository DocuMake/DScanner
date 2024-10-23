package xyz.calcugames.documake.dscanner.parser

import xyz.calcugames.documake.dscanner.Modifier
import xyz.calcugames.documake.dscanner.Modifiers
import xyz.calcugames.documake.dscanner.Modifiers.PRIVATE
import xyz.calcugames.documake.dscanner.Modifiers.PUBLIC

/**
 * Represents a map of modifiers for an element in a programming language.
 */
abstract class ModifierStorage(initialize: ModifierStorage.() -> Unit) {

    private val modifiers = mutableMapOf<String, Modifier>()
    private var locked = false

    init {
        initialize()
        locked = true
    }

    /**
     * Creates the modifiers for the element.
     * @param names The names of the modifiers.
     * @param modifier The modifier to apply to the element.
     * @throws IllegalStateException If the modifiers have already been initialized
     */
    fun create(names: Array<String>, modifier: Modifier) {
        if (locked) throw IllegalStateException("Cannot create modifiers after initialization.")
        for (name in names) {
            modifiers[name] = modifier
        }
    }

    /**
     * Creates the modifiers for the element.
     * @param name The name of the modifier.
     * @param modifier The modifier to apply to the element.
     * @throws IllegalStateException If the modifiers have already been initialized
     */
    fun create(name: String, modifier: Modifier) {
        create(arrayOf(name), modifier)
    }

    /**
     * Creates the modifiers for the element using the modifier's name.
     * @param modifier The modifier to apply to the element.
     * @throws IllegalStateException If the modifiers have already been initialized
     */
    fun create(modifier: Modifier) {
        create(modifier.name, modifier)
    }

    /**
     * Registers the [PUBLIC] and [PRIVATE] visibility modifiers.
     */
    fun registerVisibility() {
        create(PUBLIC)
        create(PRIVATE)
    }

    /**
     * Registers the object-oriented programming modifiers.
     */
    fun registerOop() {
        create(Modifiers.CLASS)
        create(Modifiers.INTERFACE)
        create(Modifiers.ENUM)
        create(Modifiers.ABSTRACT)
        create(Modifiers.VIRTUAL)
        create(Modifiers.FINAL)
    }

}