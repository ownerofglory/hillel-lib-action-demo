package ua.ithillel.lib.arithm;

import ua.ithillel.lib.exception.MyArithmException;

public class ArithmeticUtil {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new MyArithmException();
        }
        return a / b;
    }
}
