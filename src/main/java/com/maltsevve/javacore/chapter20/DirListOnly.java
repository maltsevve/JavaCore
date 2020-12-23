package main.java.com.maltsevve.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

class DirListOnly {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\Victor\\IdeaProjects\\JavaCore";
        File fl = new File(dirname);
        FilenameFilter only = new OnlyExt("dat");
        String[] s = fl.list(only);

        for (String value : s) {
            System.out.println(value);
        }
    }
}
