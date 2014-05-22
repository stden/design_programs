package ru.ifmo.cs.exceptions;

public class InvalidPrecision extends RuntimeException {
    @Override
    public String getMessage() {
        return "Invalid precision value";
    }
}
