package main.java.com.maltsevve.javacore.chapter07;

// Продемонстрировать применение аргументов переменной длины
public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();

//        int n1[] = {10};
//        vaTest(n1);
    }
}
