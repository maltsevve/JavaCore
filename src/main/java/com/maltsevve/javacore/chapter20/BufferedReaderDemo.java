package main.java.com.maltsevve.javacore.chapter20;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "Это знак авторского права &copy;, а &copy - нет.\n";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        CharArrayReader in = new CharArrayReader(buf);
        int c;
        boolean marked = false;

        try (BufferedReader bf = new BufferedReader(in)) {
            while ((c = bf.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            bf.mark(32);
                            marked = true;
                        } else
                            marked = false;
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else
                            System.out.print((char) c);
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            bf.reset();
                            System.out.print("&");
                        } else
                            System.out.print((char) c);
                    default:
                        if (!marked) System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
