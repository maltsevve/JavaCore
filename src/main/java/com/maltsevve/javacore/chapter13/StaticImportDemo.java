package main.java.com.maltsevve.javacore.chapter13;

import static java.lang.Math.*;
// Благодаря статическому импорту вызов методов возможен без указания имени класса.
// Здесь для примера использованы методы класса Math - sqrt и pow.
class StaticImportDemo {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;
        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2)); // pow - возведение в степень

        System.out.println("При заданной длине сторон " + side1 + " и " + side2 + " гипотенуза равна " + hypot);
    }
}
