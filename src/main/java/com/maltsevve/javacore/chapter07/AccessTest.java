package main.java.com.maltsevve.javacore.chapter07;

class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

        // Этот оператор не верен и может вызвать ошибку
        // ob.c = 100;

        ob.setc(100);
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
