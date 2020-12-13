package main.java.com.maltsevve.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));
        // Еще более лаконичный вариант:
        // TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());

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
