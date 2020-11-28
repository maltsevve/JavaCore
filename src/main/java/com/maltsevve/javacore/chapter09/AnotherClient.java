package main.java.com.maltsevve.javacore.chapter09;

class AnotherClient implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("Еще один вриант метода callback()");
        System.out.println("р в квадрате равно " + (p * p));
    }
}
