/**
 * Основы Java: 14.03.2014
 */
public class MyFirstClass {
    /**
     * Основной метод программы, вызывается при её запуске
     *
     * @param args - массив параметров программы
     */
    public static void main(String args[]) {
        int a = 2;
        int b = 3;
        System.out.println("a + b = " + (a + b));

        // 8 базовых (примитивных) типов
        // 4 целочисленных типа (знаковые)
        byte myByte = -100; // 1 байт
        short myShort = -1231; // 2 байта
        int myInt = 24346363; // 4 байта
        long myLong = 469523695623L; // 8 байт

        // 2 вещественных типа
        float myFloat = 23234.0f; // 4 байта
        double myDouble = 12425.523; // 8 байт

        // символьный тип
        char myChar = 'a';

        // логический тип
        boolean myBoolean1 = true;
        myBoolean1 = false;

        int var1, var2, var3, var4[], var5, var6[][];
        int[] a1, a2, a3; // Все переменные - массивы
        a1 = new int[2];
        a2 = new int[2];
        a3 = new int[2];
        a1[1] = 0;
        // Операции
        // Арифметические
        //   + - сложение
        int c = a + b;
        //   - - вычитание
        c = a - b;
        //   * - умножение
        c = a * b;
        //   / - деление
        c = a / b;
        //   % - по модулю
        c = a % b;
        // Побитовые операции:
        //  >> - сдвиг вправо
        c = a >> b;
        //  << - сдвиг влево
        c = a << b;
        // | - ИЛИ (OR)
        c = a | b;
        // & - И (AND)
        c = a & b;
        // ^ - ИСКЛЮЧАЮЩЕЕ ИЛИ - XOR
        c = a ^ b;
        // ~ - Побитовое отрицание (NOT)
        c = ~a;

        // Логические операции:
        // && - И (AND)
        boolean cb, ab = true, bb = false;
        cb = ab && bb;
        // || - ИЛИ (OR)
        cb = ab || bb;
        // ! - НЕ (NOT)
        cb = !ab;

        // Сокращённая форма
        c += a;
        c -= a;
        c *= a;
        c /= a;
        c %= a;

        // Инкремент и декремент
        ++a;
        a++; // Увеличение на единицу
        --a;
        a--; // Уменьшение на единицу
    }
}
