package xyz.calcugames.documake.dscanner.parser

/**
 * Information used by rules to parse the source file.
 */
data class ParsingInformation(
    /**
     * The line that the parsing information was retrieved from.
     */
    val line: String,
    /**
     * The index of the line in the source file.
     */
    val lineIndex: Int,
    /**
     * The source file that the parsing information was retrieved from.
     */
    val sourceFile: SourceFile
)

/**
 * Represents information retrieved from a parsing rule.
 */
interface ParsedInformation {
    /**
     * Represents whether this parse information is empty.
     */
    val isEmpty: Boolean
}

/**
 * Represents an element that can be parsed from a source file.
 */
interface Element : ParsedInformation {

    override val isEmpty: Boolean
        get() = false

    /**
     * The name of the element.
     */
    val name: String
}

/**
 * No information was parsed from the line, and it should be skipped.
 */
object Skip : ParsedInformation {
    override val isEmpty: Boolean
        get() = true
}

/**
 * No information was present from the source file line.
 */
object Empty : ParsedInformation {
    override val isEmpty: Boolean
        get() = true
}

/**
 * Parsers should move to a new line in the source file.
 * @param line The line to move to.
 */
data class MoveToLine(val line: Int) : ParsedInformation {
    override val isEmpty: Boolean
        get() = true
}