package main.java.com.maltsevve.javacore.chapter07;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ...): " + " Количество аргументов: " + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...) " + " Количество аргументов: " + v.length + " Содержимое: ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest (String msg, int ... ): Количество аргументов: " + msg + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Проверка: ", 10, 20);
        vaTest(true, false, false);
        // vaTest(); Вызов без параметров не сработает, так как создает неоднозначность:
        // может быть вызван и (boolean ... v) и (int ... v)

        //Такой вариант вызова: vaTest(l) так же будет не однозначным для перегруженных методов:
        //static void vaTe st ( int ... v) { // ...
        //static void vaTe st ( int n, int ... v) { // ...
    }
}
