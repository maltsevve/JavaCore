package main.java.com.maltsevve.javacore.chapter15;

class MyStringOps{
    static String strReverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}
class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        outStr = stringOp(MyStringOps::strReverse, inStr);

        /* Вариант строки выше, если strReverse не static:
        MyStringOps strOps = new MyStringOps();
        outStr = stringOp(strOps::strReverse, inStr); */

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Образенная строка: " + outStr);
    }
}
