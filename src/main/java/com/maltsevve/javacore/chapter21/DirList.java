package main.java.com.maltsevve.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class DirList {
    public static void main(String[] args) {
        String dirname = "out";

        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname))) {
            for (Path entry : dirstrm) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("      ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути: " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " не является каталогом.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
