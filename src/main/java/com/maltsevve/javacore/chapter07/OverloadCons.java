package main.java.com.maltsevve.javacore.chapter07;

import main.java.com.maltsevve.javacore.chapter06.Box;

class OverloadCons {
    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = myBox.volume();
        System.out.println("Объем myBox равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
