package main.java.com.maltsevve.javacore.chapter13;

import java.io.PrintWriter;

class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);

        pw.println("Это строка");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);

    }
}
