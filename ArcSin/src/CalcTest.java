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
        assertEquals(1, Calc.fact(1));
        assertEquals(2, Calc.fact(2));
        assertEquals(2 * 3, Calc.fact(3));
        assertEquals(2 * 3 * 4, Calc.fact(4));
    }

    @Test
    public void zeroTest() {
        assertEquals(0.0, Calc.riad(0.0, 100), 1e-20);
    }

    /**
     * Проверяем арксинус на линейном участке
     */
    @Test
    public void linearTest() {
        for (double x = -0.3; x < 0.3; x += 0.001) {
            assertEquals(x, Calc.riad(x, 100), 0.01);
        }
    }

    /**
     * Проверим контрольные точки
     */
    @Test
    public void checkPointTest() {
        assertEquals(PI / 2.0, Calc.riad(1, 2000), 0.01);
        assertEquals(-PI / 2.0, Calc.riad(-1, 2000), 0.01);
    }

    /**
     * Сравним со стандартной реализацией
     */
    @Test
    public void compareWithStandardImplementation() {
        for (double x = 0; x < PI / 2; x += 0.01) {
            assertEquals("x = " + x, Math.asin(x), Calc.riad(x, 1000), 0.01);
        }
    }
}
