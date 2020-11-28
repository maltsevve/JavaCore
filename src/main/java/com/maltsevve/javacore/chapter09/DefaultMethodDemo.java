package main.java.com.maltsevve.javacore.chapter09;

// Использовать метод по умолчанию
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        System.out.println(obj.getNumber());

        // Метод getStrinq() также можно вызвать, т.к. в интерфейсе
        // имеется его реализация по умолчанию:
        System.out.println(obj.getString());
    }
}
