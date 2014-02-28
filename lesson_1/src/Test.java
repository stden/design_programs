/**
 * Наша первая Java-программа
 */
public class Test {
    public static void main(String args[]) {
        // Pascal/Delphi: Writeln('Hello, groups 1893, 1894!');
        // C: printf("Hello, groups 1893, 1894!\n");
        // C++: cout << "Hello, groups 1893, 1894!" << endl;
        /*
          Многострочный...
            ...комментарий
        */
        System.out.println("Hello, groups 1893, 1894!");
        for(String s : args){
            System.out.println(s);
        }

        // Целочисленные типы:
        byte varWithoutValue;
        byte b = -128; // 127
        //  Дополнительный код
        // 00000000  - 0
        // 00000001  - 1
        // 00000010  - 2
        // 00000011  - 3
        // 00000100  - 4
        //  ...
        // 01111111  - 127
        // 10000000  - отрицательным.. -128  - 128
        //  ...
        // 11111111  - отрицательное.. -1  - 255
        short sh = 32767; // -32768..32767
        int i = 10; // 32-битное целое
        long l = 12L; // 64-битное целое

        byte b1 = (byte) 0xff;
        int bb = 0xff & b1; // & - побитное И
          // | - побитное ИЛИ
          // ~
          // ^ - XOR - исключающее ИЛИ

        // Вещественные типы (действительные)
        float floatValue = 1.0f;
        double doubleValue = 1123.22 * 1.0 / 2.3;

        // Логический тип
        boolean bool = true;
        boolean bool2 = false;
        boolean bool3 = bool && bool2; // && - И
          // || - ИЛИ
        boolean bool4 = !bool; // НЕ

        // Символьный тип
        char c1 = 'П', c2 = 'Р', c3 = 'И';
        char мояСимвольнаяПеременная = 'Д';
        System.out.println(мояСимвольнаяПеременная);

        int a;
        a = 2;
        if(a > 1){ // Когда условие истинно
            System.out.println("a большая :)");
        } else { // в противоположном случае
            System.out.println("a маленькая :)");
        }

        // Цикл с предусловием - While
        while(a > 1/* условие */){ // Пока выполняется условие
            a = a - 2;
        }

        // Цикл с постусловием - Repeat Until
        do {
            a = a * 3;
        } while(a < 3);

        // Сокращённая форма
        // a = a * 3;    a *= 3;
        // a = a + 10;   a += 10;
        // a = a / 2;    a /= 2;
        // a = a + 1;    a++;  ++a; - инкремент
        // a = a - 1;    a--;  --a; - декремент

    }
}
