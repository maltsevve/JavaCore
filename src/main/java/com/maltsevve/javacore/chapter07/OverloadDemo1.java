package main.java.com.maltsevve.javacore.chapter07;

public class OverloadDemo1 {
    void test(){
        System.out.println("Параметры отсутствуют.");
    }

    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }
    void test(double a){
        System.out.println("Внутреннее преобразование при вызове test(double) a: " + a);
    }
}

