package main.java.com.maltsevve.javacore.chapter20;

import java.io.File;

class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File fl = new File("README.md");
        p("Имя файла: " + fl.getName());
        p("Путь: " + fl.getPath());
        p("Абсолютный путь: " + fl.getAbsolutePath());
        p("Родительский каталог: " + fl.getParent());
        p(fl.exists() ? "существует" : "не существует");
        p(fl.canWrite() ? "доступен для записи" : "не досутупен для записи");
        p(fl.canRead() ? "доступен для чтения" : "не доступен для чтения");
        p(fl.isDirectory() ? "является каталогом" : "не является каталогом");
        p(fl.isFile() ? "является обычным файлом" : "может быть именованным каналом");
        p("Последнее изменение в файле: " + fl.lastModified());
        p("Размер: " + fl.length() + " байт");
    }
}
