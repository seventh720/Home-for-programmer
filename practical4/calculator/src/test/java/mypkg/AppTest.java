package mypkg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Calculator calculator = new Calculator();
    /**
     * Rigorous Test :-)
     */

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-2, calculator.add(-5, 3));
        assertEquals(1000000, calculator.add(500000, 500000));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(8, calculator.subtract(5, -3));
        assertEquals(0, calculator.subtract(100, 100));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-15, calculator.multiply(5, -3));
        assertEquals(10000, calculator.multiply(100, 100));
    }
}
