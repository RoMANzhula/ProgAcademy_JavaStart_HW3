public class Main {
    public static void main(String[] args) {
        byte b = -128;
        short s = 32757;
        int i = 456987858;
        long l = 687685463245646565L;
        float f = 12345.123456789f;
        double d = 123456789.123456734534634686;
        char c = 'A';
        boolean isFlag = false;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(isFlag);
        System.out.println("--------------------------");

        less2();
        System.out.println("--------------------------");

        char ch = 'ё';
        int fromCh = ch;
        System.out.println(fromCh);
    }

    public static void less2() {
        byte b = 12;
        short s = 20;
        int i = 36;
        boolean isFalse = false;

        int summa = b + s + i;
        int multiply = b * s * i;

        System.out.println("Summa: " + summa);
        System.out.println("Multiply: " + multiply);

        if (i > s ) {
            System.out.println(!isFalse);
        } else {
            System.out.println(isFalse);
        }
        //Or //System.out.println(i > s ? !isFalse : isFalse);

        if (i > (s + b)) {
            System.out.println(!isFalse);
        } else {
            System.out.println(isFalse);
        }
        //Or //System.out.println(i > (s + b) ? !isFalse : isFalse);
    }
}
//3.1 Сконвертувати число 1000 з десяткової в двійкову систему. (Згадати як робити, не програмно, на листку)
//1000/2 = 500, залишок 0
//500/2 = 250, залишок 0
//250/2 = 125, залишок 0
//125/2 = 62, залишок 1
//62/2 = 31, залишок 0
//31/2 = 15, залишок 1
//15/2 = 7, залишок 1
//7/2 = 3, залишок 1
//3/2 = 1, залишок 1
//1/2 = 0, залишок 1
// десяткове число 1000 - двійкове 1111101000

//4.1 Сконвертувати число 11011010 із двійкової в десяткову систему. (Згадати як це робити, не програмно, на листку)
//11011010 = (1*2в7ст) + (1*2в6ст) ​​+ (0*2в5ст) + (1*2в4ст) + (1*2в3ст) + (0*2в2ст) + (1*2в1ст) + (0*2в0ст) ) =
//= 128 + 64 + 0 + 16 + 8 + 0 + 2 + 0 = 218

//5.2 Уявіть, що ви працюєте з комп'ютерної логікою конвертації. Сконвертувати число 11011010 з двійкової в
// десяткову систему, враховуючи НЕГАТИВНИЙ біт. (Згадати як це робити, не програмно, на листку)
//Враховуючи негативний біт число буде дорівнює -
//11012010 = -128 + 64 + 0 + 16 + 8 + 0 + 2 + 0 = -38
