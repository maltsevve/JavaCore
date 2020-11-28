package main.java.com.maltsevve.javacore.chapter04;

//Продемонстрировать применение операции инкремента ++
public class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b;
        d = a++; //d = 1, так как сначала d присваивается значение a,
        //затем а увеличивается на 1. В строчке выше для с и b наоборот.
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
