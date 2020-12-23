package main.java.com.maltsevve.javacore.chapter20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter caw = new CharArrayWriter();
        String s = " Эти данные должны быть выведены в массив";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        try {
            caw.write(buf);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(caw.toString());
        System.out.println("В массив");

        char[] c = caw.toCharArray();
        for (char ch : c) {
            System.out.print(ch);
        }

        System.out.println();

        try (FileWriter f2 = new FileWriter("test.txt")) {
            caw.writeTo(f2);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Установка в исходное состояние");
        caw.reset();

        for (int i = 0; i < 3; i++) caw.write('X');

        System.out.println(caw.toString());
    }
}
