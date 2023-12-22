package ua.ithillel.lib.arithm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.ithillel.lib.exception.MyArithmException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticUtilTest {
    private ArithmeticUtil arithmeticUtil;

    @BeforeEach
    public void setUp() {
        arithmeticUtil = new ArithmeticUtil();
    }

    @Test
    public void addTest() {
        double a = 10;
        double b = 20;

        double exected = 30;

        final double actual = arithmeticUtil.add(a, b);

        assertEquals(exected, actual);
    }

    @Test
    public void subtractTest() {
        double a = 10;
        double b = 20;

        double exected = -10;

        final double actual = arithmeticUtil.subtract(a, b);

        assertEquals(exected, actual);
    }

    @Test
    public void multiplyTest() {
        double a = 10;
        double b = 20;

        double exected = 200;

        final double actual = arithmeticUtil.multiply(a, b);

        assertEquals(exected, actual);
    }

    @Test
    public void divideTest() {
        double a = 10;
        double b = 20;

        double exected = 0.5;

        final double actual = arithmeticUtil.divide(a, b);

        assertEquals(exected, actual);
    }

    @Test
    public void divideTest_divisorIsZero() {
        double a = 10;
        double b = 0;


        assertThrows(MyArithmException.class,
                () -> arithmeticUtil.divide(a, b));

    }

    @AfterEach
    public void tearDown() {
        arithmeticUtil = null;
    }
}
