package main.java.com.maltsevve.javacore.chapter21;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class DirList1 {
    public static void main(String[] args) {
        String dirname = ".idea";

        // создать фильтр, возвращающий логическое значение true
        // только в отношении доступных для записи файлов
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                return Files.isWritable(entry);
            }
        };

        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname), how)) {
            System.out.println("Каталог " + dirname);

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
