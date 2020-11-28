package main.java.com.maltsevve.javacore.chapter09;

interface IntStack {
    void push(int item);
    int pop();

    // У метода clear() теперь имеется вариант по умолчанию, поэтому
    // его придется реализоваться в том существующем классе, где уже
    // применяется интерфейс IntStack
    default void clear() {
        System.out.println("Метод clear() не реализован.");
    }
}
