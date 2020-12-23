package main.java.com.maltsevve.javacore.chapter20;

import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay their due taxes.";
        char[] buffer = new char[source.length()];

        try (FileWriter fos0 = new FileWriter("file1.txt");
             FileWriter fos1 = new FileWriter("file2.txt");
             FileWriter fos2 = new FileWriter("file3.txt")) {

            for (int i = 0; i < buffer.length; i += 2) fos0.write(buffer[i]);

            fos1.write(buffer);

            fos2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
