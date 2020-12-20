package main.java.com.maltsevve.javacore.chapter15;

class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;
        System.out.println("Фиксированное значение: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Еще одно случайное значение: " + myNum.getValue());

        // Лямбда-выражение должно быть совместимо с абстрактным методом,
        // определяемым в функциональном интерфейсе. Поэтому следующая
        // строка кода ошибочна:
        // myNum = () -> "123.03";  ОШИБКА!
    }
}

interface MyNumber {
    double getValue();
}
