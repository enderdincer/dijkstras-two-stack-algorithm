package algorithm

import Expressions
import java.util.Stack

object DijkstrasExpressionEvaluator {

    fun evaluate(expression: String): Double {
        val operandsStack = Stack<Double>()
        val operatorsStack = Stack<Char>()

        expression.forEach {
            if (it == Expressions.RIGHT_BRACKET_CHAR) {

            }

            if (Expressions.isArithmeticOperator(it)) {
                operatorsStack.push(it)
            }

            if (Expressions.isArithmeticOperand(it)) {
                operandsStack.push(it.digitToInt().toDouble())
            }
        }
        return -1.0
    }
}