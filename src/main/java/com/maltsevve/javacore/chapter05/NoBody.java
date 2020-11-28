package main.java.com.maltsevve.javacore.chapter05;

public class NoBody {
    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        //рассчитать среднее значение переменных i и j
        while (++i < --j); //цикл без тела
        System.out.println("Среднее значение равно " + i);
    }
}
