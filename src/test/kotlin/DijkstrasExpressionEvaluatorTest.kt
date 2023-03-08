import algorithm.DijkstrasExpressionEvaluator
import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class DijkstrasExpressionEvaluatorTest {


    @ParameterizedTest
    @CsvSource(
        value = [
            "(1+2) = 3.0",
            "(2-6) = -4.0",
            "(1/2) = 0.5",
            "(3*5) = 15.0",
            "((3+1) * (5-2)) = 12.0"
        ],
        delimiter = '='
    )
    fun `Test Expression Evaluator`(expression: String, expectedResult: Double) {
        Assertions.assertThat(DijkstrasExpressionEvaluator.evaluate(expression)).isEqualTo(expectedResult)
    }
}