import org.junit.Test;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;

/**
 * Тестирование вычислений
 */
public class CalcTest {

    /**
     * Проверяем правильность работы факториала
     */
    @Test
    public void factorial() {
<<<<<<< HEAD
        assertEquals(1, Calc.fact(1));
        assertEquals(2, Calc.fact(2));
        assertEquals(2 * 3, Calc.fact(3));
        assertEquals(2 * 3 * 4, Calc.fact(4));
=======
        assertEquals(1, Calc.fact(1), 0.0001);
        assertEquals(2, Calc.fact(2), 0.0001);
        assertEquals(2 * 3, Calc.fact(3), 0.0001);
        assertEquals(2 * 3 * 4, Calc.fact(4), 0.0001);
>>>>>>> origin/master
    }

    @Test
    public void zeroTest() {
<<<<<<< HEAD
        assertEquals(0.0, Calc.riad(0.0, 100), 1e-20);
=======
        assertEquals(0.0, Calc.riad(0.0, 50), 1e-20);
>>>>>>> origin/master
    }

    /**
     * Проверяем арксинус на линейном участке
     */
    @Test
    public void linearTest() {
        for (double x = -0.3; x < 0.3; x += 0.001) {
<<<<<<< HEAD
            assertEquals(x, Calc.riad(x, 100), 0.01);
=======
            assertEquals(x, Calc.riad(x, 80), 0.01);
>>>>>>> origin/master
        }
    }

    /**
     * Проверим контрольные точки
     */
    @Test
    public void checkPointTest() {
<<<<<<< HEAD
        assertEquals(PI / 2.0, Calc.riad(1, 2000), 0.01);
        assertEquals(-PI / 2.0, Calc.riad(-1, 2000), 0.01);
=======
        assertEquals(PI / 2.0, Calc.riad(1), 0.1);
        assertEquals(-PI / 2.0, Calc.riad(-1), 0.1);
>>>>>>> origin/master
    }

    /**
     * Сравним со стандартной реализацией
     */
    @Test
    public void compareWithStandardImplementation() {
<<<<<<< HEAD
        for (double x = 0; x < 1; x += 0.01) {
            assertEquals("x = " + x, Math.asin(x), Calc.riad(x, 1000), 0.1);
        }
    }

    @Test
    public void compareWithStandardImplementation2() {
        for (double x = 0; x < 1; x += 0.001) {
            assertEquals("x = " + x, Math.asin(x), Calc.arcsin(x, 1000), 0.00001);
        }
    }

=======
        for (double x = 0; x < 1; x += 0.1) {
            assertEquals("x = " + x, Math.asin(x), Calc.riad(x), 0.1);
        }
    }
>>>>>>> origin/master
}
