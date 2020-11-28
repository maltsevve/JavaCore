package main.java.com.maltsevve.javacore.chapter03;

//Цель: продемонстрировать област действия блока кода, видимость переменных.
public class Scope {
    public static void main(String[] args) {
        int x; //доступен всему коду.

        x = 10;
        if (x == 10) { //Начало блока кода
            int y = 20;

            System.out.println("x и у: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; //Ошибка, y вне зоны видимости здесь.
        System.out.println("x равно " + x);
    }
}
