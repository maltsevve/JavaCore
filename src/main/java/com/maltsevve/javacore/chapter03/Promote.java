package main.java.com.maltsevve.javacore.chapter03;

//Демонстрация правил продвижения типов
public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s); //b продвигается к float,c продвигается к int,
        //s продвигается к double, сложение результатов первых двух скобок float,
        //а вычитание третьей и результат всего выражения продвигается к double.
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
