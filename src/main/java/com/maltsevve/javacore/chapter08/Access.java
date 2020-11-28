package main.java.com.maltsevve.javacore.chapter08;

public class Access {
    public static void main(String[] args) {
        B1 supOb = new B1();

        supOb.setij(10, 12);

        supOb.sum();
        System.out.println("Сумма равна " + supOb.total);
    }
}
