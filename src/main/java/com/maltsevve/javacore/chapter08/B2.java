package main.java.com.maltsevve.javacore.chapter08;

class B2 extends A2 {
    int i;

    B2(int a, int b) {
        super.i = a;  // член i из класса А2
        i = b;        // член i из класса B2
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}
