package main.java.com.maltsevve.javacore.chapter20;

import java.io.File;

class DirList {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\Victor\\IdeaProjects\\JavaCore";
        File fl = new File(dirname);
        if (fl.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String s[] = fl.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) System.out.println(s[i] + " является каталогом");
                else System.out.println(s[i] + " является файлом");
            }
        } else System.out.println(dirname + " не является каталогом");
    }
}
