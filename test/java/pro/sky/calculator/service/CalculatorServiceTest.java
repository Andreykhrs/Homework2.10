package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.exception.NotValidationArgumentException;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void plusTest() {
        int num1 = 1;
        int num2 = 1;

        int expected = 2;

        int actual = num1 + num2;

        Assertions.assertEquals(expected, actual);

        num1 = -1;
        num2 = -1;

        expected = -2;

        actual = num1 + num2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void minusTest() {
        int num1 = 1;
        int num2 = 1;

        int expected = 0;

        int actual = num1 - num2;

        Assertions.assertEquals(expected, actual);

        num1 = -1;
        num2 = -1;

        expected = 0;

        actual = num1 - num2;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    void multiplyTest() {
        int num1 = 1;
        int num2 = 1;

        int expected = 1;

        int actual = num1 * num2;

        Assertions.assertEquals(expected, actual);

        num1 = -1;
        num2 = -1;

        expected = 1;

        actual = num1 * num2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void divideTest() {
        int num1 = 1;
        int num2 = 1;

        int expected = 1;

        int actual = num1 / num2;

        Assertions.assertEquals(expected, actual);

        num1 = -1;
        num2 = -1;

        expected = 1;

        actual = num1 / num2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void divideNegativeTest() {
        Assertions.assertThrows(NotValidationArgumentException.class, () -> calculatorService.divide(1, 0));
    }


}
