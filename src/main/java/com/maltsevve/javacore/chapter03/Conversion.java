package main.java.com.maltsevve.javacore.chapter03;

//Продемонстрировать приведение типов
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование типа int в тип byte.");
        b = (byte) i; //получим результат остатка от деления i/b - 257/256
        System.out.println("i и b " + i + " " + b);

        System.out.println("\nПреобразование типа double в тип int.");
        i = (int) d;
        System.out.println("d и i " + d + " " + i);

        System.out.println("\nПреобразование типа double в тип byte.");
        b = (byte) d; //получим результат деления по модулю d/b 323/256
        System.out.println("d и b " + d + " " + b);
    }
}
