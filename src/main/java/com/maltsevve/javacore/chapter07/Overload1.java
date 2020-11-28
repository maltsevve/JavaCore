package main.java.com.maltsevve.javacore.chapter07;

class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); // Ключевое значение этой демонстрации в результате выполнения данной строки,
        // так как у нас нет конструктора int, передаваемое значение автоматически продвинуто до double.
        ob.test(123.2);
    }
}
