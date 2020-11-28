package main.java.com.maltsevve.javacore.chapter05;

// Применение оператора break в цикле for в стиле for each
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            sum += x;
            if (x == 5) break;
        }

        System.out.println("Сумма первых пяти элементов равна: " + sum);
    }
}
