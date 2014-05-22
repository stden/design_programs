package ru.ifmo.cs.functions;

import static java.lang.StrictMath.cos;

/**
 * Косинус
 */
public class Cos implements IFunc {
    @Override
    public double get(double x) {
        return cos(x);
    }
}
