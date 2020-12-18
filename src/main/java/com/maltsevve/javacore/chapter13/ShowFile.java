package main.java.com.maltsevve.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])){
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        }
    }
}
