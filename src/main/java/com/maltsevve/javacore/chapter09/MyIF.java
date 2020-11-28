package main.java.com.maltsevve.javacore.chapter09;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
