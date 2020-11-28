package main.java.com.maltsevve.javacore.chapter05;

// Продемонстрировать применение оператора continue
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue; // Если число не четное, то перехода к новой строке не будет.
            System.out.println("");
        }
    }
}
