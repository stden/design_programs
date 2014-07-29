package com.mathdemo;

public class Main {

    public static void main(String[] args) {
        check(0.3, 0.7, 1.0);
        check(0.4, 0.7, 1.1);
        check(0.5, 0.7, 1.2);
        check(0.6, 0.7, 1.3);
        check(0.7, 0.7, 1.4);
        check(0.8, 0.7, 1.5);
    }

    /**
     * Проверка, что a+b = c
     */
    static void check(double a, double b, double c) {
        if (a + b == c) {
            System.out.printf("YES ;)  %s + %s == %s%n", a, b, c);
        } else {
            double diff = a + b - c; // Разница
            System.out.printf("NO :( %s + %s != %s (%s)%n", a, b, c, diff);
        }
    }
}
