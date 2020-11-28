package main.java.com.maltsevve.javacore.chapter09.p1;

class Derived extends Protection{
    Derived() {
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);

        // доступно только для класса
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
