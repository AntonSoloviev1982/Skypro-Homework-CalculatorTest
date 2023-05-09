package pro.sky.skyprohomeworkcalculatortest;


import org.junit.jupiter.api.Test;
import pro.sky.skyprohomeworkcalculatortest.service.CalculatorService;
import pro.sky.skyprohomeworkcalculatortest.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void resultAddition() {
        int expected1 = out.plus(5, 3);
        int actual1 = 5 + 3;
        int expected2 = out.plus(-5, -9);
        int actual2 = -5 + (-9);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void resultSubtraction() {
        int expected1 = out.minus(12, 6);
        int actual1 = 12 - 6;
        int expected2 = out.minus(-3, -7);
        int actual2 = -3 - (-7);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void resultMultiplication() {
        int expected1 = out.multiply(4, 7);
        int actual1 = 4 * 7;
        int expected2 = out.multiply(-6, -9);
        int actual2 = -6 * (-9);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void resultDivision() {
        int expected1 = out.divide(18, 9);
        int actual1 = 18 / 9;
        int expected2 = out.divide(-42, -7);
        int actual2 = -42 / -7;
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenSecondParamIsZero() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(9, 0));
    }


}
