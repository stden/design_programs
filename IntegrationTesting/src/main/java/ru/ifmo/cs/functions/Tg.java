package ru.ifmo.cs.functions;

import static java.lang.Math.tan;

/**
 * Тангенс
 */
public class Tg implements IFunc {
    @Override
    public double get(double x) {
        return tan(x);
    }
}
