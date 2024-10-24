package xyz.calcugames.documake.dscanner.parser

/**
 * Represents the root class for all language parsers and their extensions.
 */
abstract class LanguageParser {

    /**
     * The storage for all modifiers that are used in the language.
     */
    abstract val modifierStorage: ModifierStorage

    /**
     * Represents the list of parsing rules that are used to parse the source file.
     */
    val rules: MutableList<Rule> = mutableListOf()

}