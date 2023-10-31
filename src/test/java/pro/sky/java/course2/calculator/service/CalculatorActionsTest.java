package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorActionsTest {

    private static final Calculation calculation = new CalculatorActions();

    @Test
    public void when5Plus5Then10() {
        int expect = 10;
        int actual = calculation.plusAction("5", "5");
        assertEquals(expect, actual);
    }

    @Test
    public void when12Minus7Then5() {
        int expect = 7;
        int actual = calculation.minusAction("12", "5");
        assertEquals(expect, actual);
    }

    @Test
    public void when3Multiply4Then() {
        int expect = 12;
        int actual = calculation.multiplyAction("3", "4");
        assertEquals(expect, actual);
    }

    @Test
    public void when12Divide3Then4() {
        int except = 4;
        int actual = calculation.divideAction("12", "3");
        assertEquals(except, actual);
    }

    @Test
    public void whenDivideWith0() {
        assertThrows(IllegalArgumentException.class, () -> calculation.divideAction("4", "0"));
    }
}