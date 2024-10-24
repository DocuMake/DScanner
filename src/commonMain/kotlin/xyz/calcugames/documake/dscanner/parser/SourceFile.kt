package xyz.calcugames.documake.dscanner.parser

/**
 * Represents a source file that is to be parsed.
 */
class SourceFile(
    /**
     * The full name of the file.
     */
    val fileName: String,
    /**
     * The lines in the source file as an array of strings.
     */
    val lines: Array<String>
) : Iterable<String> {

    /**
     * The number of lines in the source file.
     */
    val lineCount: Int
        get() = lines.size

    /**
     * Gets the line at the specified index.
     * @param index The index of the line to get.
     * @return The line at the specified index.
     */
    operator fun get(index: Int): String {
        return lines[index]
    }

    override fun iterator(): Iterator<String> = lines.iterator()

}