package main.java.com.maltsevve.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr); // Сравнение в обратном порядке
    }
}

class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        // Альтернативный вариант при помощи лямбда выражения:
        // TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String str : ts) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
