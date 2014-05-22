package ru.ifmo.cs.functions.stub;

/**
 * Заглушка для функции, всегда возвращающая 1
 */
public class FuncStub implements ru.ifmo.cs.functions.IFunc {
    @Override
    public double get(double x) {
        return 1;
    }
}
