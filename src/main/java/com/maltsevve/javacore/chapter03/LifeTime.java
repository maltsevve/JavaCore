package main.java.com.maltsevve.javacore.chapter03;

//Продемонстрировать срок действия переменной
public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; //новая инициализация при кждом новом вхождении в блок кода
            System.out.println("y равно: " + y);

            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}
