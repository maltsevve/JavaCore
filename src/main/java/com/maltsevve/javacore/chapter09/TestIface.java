package main.java.com.maltsevve.javacore.chapter09;

class TestIface {
    public static void main(String[] args) {
        Callback c = new Client(); // c нельзя использовать для доступа к прочим методам класса Client,
        // только к доставшимся от имплементированного интерфейса Callback: c.nonIfaceMeth не сработает.
        c.callback(42);
    }
}
