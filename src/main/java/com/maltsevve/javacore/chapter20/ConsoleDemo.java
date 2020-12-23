package main.java.com.maltsevve.javacore.chapter20;

import java.io.Console;

class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        if (con == null) return;

        str = con.readLine("Введите строку: ");
        con.printf("Введенная вами строка: %s\n", str);
    }
}
