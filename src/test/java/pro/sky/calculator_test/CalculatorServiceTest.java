package pro.sky.calculator_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService service = new CalculatorService();

    @Test
    void testPlus() {
        assertEquals(3, service.plus(1, 2));
        assertEquals(1, service.plus(-1, 2));
        assertEquals(-1, service.plus(1, -2));
        assertEquals(2, service.plus(0, 2));
        assertEquals(1, service.plus(1, 0));
        assertEquals(-3, service.plus(-1, -2));
        assertEquals(0, service.plus(0, 0));
    }

    @Test
    void testMinus() {
        assertEquals(-1, service.minus(1, 2));
        assertEquals(-3, service.minus(-1, 2));
        assertEquals(3, service.minus(1, -2));
        assertEquals(-2, service.minus(0, 2));
        assertEquals(1, service.minus(1, 0));
        assertEquals(1, service.minus(-1, -2));
        assertEquals(0, service.minus(0, 0));
    }

    @Test
    void testMultiply() {
        assertEquals(2, service.multiply(1, 2));
        assertEquals(-2, service.multiply(-1, 2));
        assertEquals(-2, service.multiply(1, -2));
        assertEquals(0, service.multiply(0, 2));
        assertEquals(0, service.multiply(1, 0));
        assertEquals(2, service.multiply(-1, -2));
        assertEquals(0, service.multiply(0, 0));
    }

    @Test
    void testDivide() {
        assertEquals(0, service.divide(1, 2));
        assertEquals(-1, service.divide(-2, 2));
        assertEquals(-1, service.divide(2, -2));
        assertEquals(0, service.divide(0, 2));
        assertEquals(2, service.divide(-4, -2));
        assertThrows(IllegalStateException.class, () -> service.divide(1, 0));
    }
}