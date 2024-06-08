package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.exception.NotValidationArgumentException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForPlus")
    void plusTest(int num1, int num2, int expected) {
        int actual = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideParamsForPlus() {
        return Stream.of(
                Arguments.of(1, 1, 2),
                Arguments.of(1, 0, 1),
                Arguments.of(-1, -1, -2)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMinus")
    void minusTest(int num1, int num2, int expected) {
        int actual = calculatorService.minus(num1, num2);
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideParamsForMinus() {
        return Stream.of(
                Arguments.of(1, 1, 0),
                Arguments.of(1, 0, 1),
                Arguments.of(-1, -1, 0)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiply")
    void multiplyTest(int num1, int num2, int expected) {
        int actual = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideParamsForMultiply() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(1, 0, 0),
                Arguments.of(-1, -1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivide")
    void divideTest(int num1, int num2, int expected) {
        int actual = calculatorService.divide(num1, num2);
        Assertions.assertEquals(expected, actual);

    }

    static Stream<Arguments> provideParamsForDivide() {
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(1, 2, 0),
                Arguments.of(-1, -1, 1)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivideNegative")
    void divideNegaiveTest(int num1, int num2) {
        Assertions.assertThrows(NotValidationArgumentException.class, () -> calculatorService.divide(num1,num2));

    }

    static Stream<Arguments> provideParamsForDivideNegative() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(-1, 0)
        );
    }



}