package ru.ifmo.cs.exceptions;


public class ZeroPrecision extends RuntimeException {
    @Override
    public String getMessage() {
        return "Precision can not be zero";
    }
}
