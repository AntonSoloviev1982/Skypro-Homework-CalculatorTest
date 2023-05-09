package pro.sky.skyprohomeworkcalculatortest;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skyprohomeworkcalculatortest.service.CalculatorService;
import pro.sky.skyprohomeworkcalculatortest.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

    CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForMethodPlus")
    public void resultAddition(int num1, int num2, int expected) {
        int actual = out.plus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMethodMinus")
    public void resultSubtraction(int num1, int num2, int expected) {
        int actual = out.minus(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMethodMultiply")
    public void resultMultiplication(int num1, int num2, int expected) {
        int actual = out.multiply(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMethodDivide")
    public void resultDivision(int num1, int num2, int expected) {
        int actual = out.divide(num1, num2);
        assertEquals(expected, actual);
    }


    public static Stream<Arguments> provideParamsForMethodPlus() {
        return Stream.of(
                Arguments.of(5, 3, 8),
                Arguments.of(-5, -9, -14)
        );
    }

    public static Stream<Arguments> provideParamsForMethodMinus() {
        return Stream.of(
                Arguments.of(12, 6, 6),
                Arguments.of(-3, -7, 4)
        );
    }

    public static Stream<Arguments> provideParamsForMethodMultiply() {
        return Stream.of(
                Arguments.of(4, 7, 28),
                Arguments.of(-6, -9, 54)
        );
    }

    public static Stream<Arguments> provideParamsForMethodDivide() {
        return Stream.of(
                Arguments.of(18, 9, 2),
                Arguments.of(-42, -7, 6)
        );
    }

}
