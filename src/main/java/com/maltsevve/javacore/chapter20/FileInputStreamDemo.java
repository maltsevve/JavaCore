package main.java.com.maltsevve.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream fis = new FileInputStream("src/main/java/com/maltsevve/javacore/" +
                "chapter20/FileInputStreamDemo.java")) {
            System.out.println("Общее количество доступныз байт: " + (size = fis.available()));
            int n = size / 40;
            System.out.println("Первые " + n + " байт, прочитанных по очереди методом read()");
            for (int i = 0; i < n; i++)
                System.out.print((char) fis.read());
            System.out.println("\nВсе еще доступно: " + fis.available());

            System.out.println("Чтение следующих " + n + " байт по очереди методом read(b[])");
            byte[] b = new byte[n];
            if (fis.read(b) != n) System.err.println("Нельзя прочитать " + n + " байт.");

            System.out.println(new String(b, 0, n));
            System.out.println("\nВсе еще доступно: " + (size = fis.available()));

            System.out.println("Чтение " + n / 2 + " байт, размещенных в конце массива");
            if (fis.read(b, n / 2, n / 2) != n / 2)
                System.err.println("Нельзя прочитать " + n / 2 + " байт.");

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсе еще доступно: " + fis.available());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
