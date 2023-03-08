object Expressions {

    val LEFT_BRACKET_CHAR = '('
    val RIGHT_BRACKET_CHAR = ')'

    val ARITHMETIC_OPERATOR_CHARS = listOf('+', '/', '*', '-')

    val ARITHMETIC_OPERATORS = listOf("+", "/", "*", "-")


    fun isArithmeticOperator(char: Char): Boolean = ARITHMETIC_OPERATOR_CHARS.contains(char)

    fun isArithmeticOperator(string: String): Boolean = ARITHMETIC_OPERATORS.contains(string)

    fun isArithmeticOperand(char: Char): Boolean = char.isDigit()

}