import static java.lang.Math.pow;

/**
 * Вычисления
 */
public class Calc {

    public static double fact(int num) {
        double res = (num == 0) ? 1 : num * fact(num - 1);
        if (Double.isNaN(res) || Double.isInfinite(res))
            throw new ArithmeticException("Переполнение: " + num);
        return res;
    }

    /**
     * Вычисление арксинуса через разложение в ряд
     *
     * @param x   аргумент
     * @param kol количество членов ряда
     * @return результат - значение арксинуса
     */
    public static double riad(double x, int kol) {
        double fan = 0;
        double arg1;
        double arg2;
        double arg3;

        for (int n = 0; n <= kol; n++) {
            arg1 = fact(2 * n);
            arg2 = pow(4, n) * pow(fact(n), 2) * (2 * n + 1);
            arg3 = pow(x, 2 * n + 1);
            fan += (arg1 / arg2) * arg3;
        }
        return fan;
    }

    /**
     * Вычисление арксинуса через разложение в ряд
     *
     * @param x   аргумент
     * @param kol количество членов ряда
     * @return результат - значение арксинуса
     */
    public static double arcsin(double x, int kol) {
        double arg1;
        double arg2;
        double arg3;

        double t = x; // Член ряда
        double fan = t;

        for (long n = 1; n <= kol; n++) {
            arg1 = (2 * n - 1) * (2 * n);
            arg2 = 4.0 * pow(n, 2);
            arg3 = pow(x, 2);
            t *= (arg1 * arg3) / arg2;
            double tt = t / (2 * n + 1);
            fan += tt;
        }
        return fan;
    }

    public static double riad(double x) {
        return riad(x, 80);
    }
}
