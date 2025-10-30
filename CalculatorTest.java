import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void add_returnsSumOfTwoNumbers() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    void subtract_returnsDifferenceOfTwoNumbers() {
        assertEquals(1, calc.subtract(5, 4));
    }

    @Test
    void multiply_returnsProductOfTwoNumbers() {
        assertEquals(20, calc.multiply(5, 4));
    }

    @Test
    void divide_returnsQuotientOfTwoNumbers() {
        assertEquals(2.5, calc.divide(5, 2), 0.0001);
    }

    @Test
    void divide_byZero_throwsException() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }
}
