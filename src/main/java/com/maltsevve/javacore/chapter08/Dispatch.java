package main.java.com.maltsevve.javacore.chapter08;

public class Dispatch {
    public static void main(String[] args) {
        A5 a = new A5();
        B5 b = new B5();
        C1 c = new C1();

        A5 r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
