package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorActionsWithParametrsTest {

    private static final Calculation calculation = new CalculatorActions();

    public static Stream<Arguments> provideParamsForPlusTest() {
        return Stream.of(
          Arguments.of("5", "5", 10),
          Arguments.of("10", "5", 15)
        );
    }

    public static Stream<Arguments> provideParamsForMinusTest() {
        return Stream.of(
                Arguments.of("5", "5", 0),
                Arguments.of("10", "5", 5)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTest() {
        return Stream.of(
                Arguments.of("5", "5", 25),
                Arguments.of("10", "5", 50)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTest() {
        return Stream.of(
                Arguments.of("5", "5", 1),
                Arguments.of("10", "5", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForPlusTest")
    public void whenPlusCalculation(String num1, String num2, int expect) {
        int actual = calculation.plusAction(num1, num2);
        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusTest")
    public void whenMinusCalculation(String num1, String num2, int expect) {
        int actual = calculation.minusAction(num1, num2);
        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTest")
    public void whenMultiplyCalculation(String num1, String num2, int expect) {
        int actual = calculation.multiplyAction(num1, num2);
        assertEquals(expect, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTest")
    public void whenDivideCalculation(String num1, String num2, int expect) {
        int actual = calculation.divideAction(num1, num2);
        assertEquals(expect, actual);
    }

}