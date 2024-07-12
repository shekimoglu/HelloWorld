import org.example.unitTest.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int expected = 5;

        int actual = calculator.sum(2, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 2;

        int actual = calculator.subtract(5, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 6;

        int actual = calculator.multiply(2, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        double expected = 2.5;

        double actual = calculator.divide(5, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        boolean actual = calculator.isEven(4);

        assertTrue(actual);
    }

    @Test
    public void testIncrementArray() {
        int[] expected = {2, 3, 4, 5, 6};
        int[] actual =  calculator.incrementArray(new int[]{1, 2, 3, 4, 5});

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
