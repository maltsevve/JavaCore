package main.java.com.maltsevve.javacore.chapter08;

import main.java.com.maltsevve.javacore.chapter06.Box;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // super используется для инициализации собственных свойств объекта типа Box
        // теперь значения не инициализируются в классе BoxWeight, а передаются в конструктор Box.
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}
