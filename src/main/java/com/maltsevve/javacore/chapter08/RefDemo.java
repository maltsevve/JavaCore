package main.java.com.maltsevve.javacore.chapter08;

import main.java.com.maltsevve.javacore.chapter06.Box;

// Переменная суперкласса может ссылаться на объект подкласса
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        // Присвоить ссылке на объект ВoxWeight ссылки на объект Вox
        plainbox = weightbox; // НО! ПРИ ДАННОМ ДЕЙСТВИИ МЫ ПОТЕРЯЛИ ЧЕТВЕРТЫЙ ПАРАМЕТР - ВЕС!
        vol = plainbox.volume(); //Верно, т.к. метод volume() определен в классе Box
        System.out.println("Объем plainbox равен " + vol);

        // Ошибка, так как член plainbox не определяет член weight
        // System.out.println("Вес Plainbox равен " + plainbox.weight);
    }
}
