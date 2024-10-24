package xyz.calcugames.documake.dscanner.parser

/**
 * Represents a parsing rule that can be used to match against a file line.
 */
data class Rule(
    /**
     * The name of the parsing rule.
     */
    val name: String,
    /**
     * The predicate of the rule to construct when the rule is matched against a file line.
     */
    val parse: (ParsingInformation) -> ParsedInformation
)

/**
 * Utility class for creating parsing rules.
 */
class RuleBuilder(private val name: String) {

    private val skipIf = mutableListOf<(String) -> Boolean>()
    private val skipN = mutableListOf<(String, Int) -> Int>()

    /**
     * The parsing function for the rule. By default, it returns [Empty].
     */
    var parse: (ParsingInformation) -> ParsedInformation = { Empty }

    /**
     * Skips the line if the predicate is true.
     * @param predicate The predicate to skip the line.
     * @return true if the rule was added, false otherwise.
     */
    fun skipIf(predicate: (String) -> Boolean) = skipIf.add(predicate)

    /**
     * Ignores the line if it starts with the specified prefix.
     * @param prefix The prefix to ignore.
     * @return true if the rule was added, false otherwise.
     */
    fun ignoreStartsWith(prefix: String) = skipIf { it.startsWith(prefix) }

    /**
     * Ignores the line if it contains the specified string.
     * @param string The string to ignore.
     * @return true if the rule was added, false otherwise.
     */
    fun ignoreContains(string: String) = skipIf { it.contains(string) }

    /**
     * Parses the line with the specified block.
     * @param block The block to parse the line, accepting the line of code.
     * @return true if the rule was added, false otherwise.
     */
    fun parse(block: (String) -> ParsedInformation) {
        parse = { info -> block(info.line) }
    }

    /**
     * Skips the specified number of lines if the predicate is true.
     * @param result The result to skip the line.
     * @return true if the rule was added, false otherwise.
     */
    fun skipN(result: (String, Int) -> Int) = skipN.add(result)

    /**
     * Skips the specified number of lines if the predicate is true.
     * @param predicate The predicate to skip the line.
     * @return true if the rule was added, false otherwise.
     */
    fun skipN(count: Int, predicate: (String, Int) -> Boolean) = skipN { line, index -> if (predicate(line, index)) count else 0 }

    /**
     * Builds the final rule.
     * @return The constructed rule.
     */
    fun build(): Rule {
        return Rule(name) { info ->
            if (skipIf.any { it(info.line) }) { return@Rule Skip }
            for (skip in skipN) {
                val count = skip(info.line, info.lineIndex)
                if (count > 0)
                    return@Rule MoveToLine(info.lineIndex + count)
            }

            return@Rule parse(info)
        }
    }
}

/**
 * Creates a parsing rule with the specified name and predicate.
 * @param block The block to construct the rule.
 * @return The constructed rule.
 */
fun rule(name: String, block: RuleBuilder.() -> Unit): Rule = RuleBuilder(name).apply { block() }.build()