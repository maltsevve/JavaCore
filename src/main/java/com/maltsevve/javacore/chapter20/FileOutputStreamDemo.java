package main.java.com.maltsevve.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay their due taxes.";
        byte buf[] = source.getBytes();

        try (FileOutputStream fos0 = new FileOutputStream("file1.txt");
             FileOutputStream fos1 = new FileOutputStream("file2.txt");
             FileOutputStream fos2 = new FileOutputStream("file3.txt")) {

            for (int i = 0; i < buf.length; i += 2) fos0.write(buf[i]);

            fos1.write(buf);

            fos2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
