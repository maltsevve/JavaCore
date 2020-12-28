package main.java.com.maltsevve.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor {
    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {
    public static void main(String[] args) {
        String dirname = "src/main/java/com/maltsevve/javacore/chapter21";
        System.out.println("Дерево каталогов начиная с каталога " + dirname + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
