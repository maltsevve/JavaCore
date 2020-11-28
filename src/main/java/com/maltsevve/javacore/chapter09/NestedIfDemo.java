package main.java.com.maltsevve.javacore.chapter09;

public class NestedIfDemo {
    public static void main(String[] args) {

        A.NestedIf nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
