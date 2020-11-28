package main.java.com.maltsevve.javacore.chapter09;

class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, могут определятся и другие члены");
    }
}
