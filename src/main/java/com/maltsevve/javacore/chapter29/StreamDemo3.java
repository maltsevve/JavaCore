package main.java.com.maltsevve.javacore.chapter29;

import java.util.ArrayList;

class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        double productOfSqrRoots = myList.parallelStream().reduce(1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b); // Эта строка служит для правильного объединения, если бы
                                  // использовался обычный Stream, то она не потребовалась бы.
                                  // Без нее перемножаться будут не частичные результаты,
                                  // а их квадратные корни.
        System.out.println("Произведение квадратных корней: " + productOfSqrRoots);
    }
}
