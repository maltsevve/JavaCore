package main.java.com.maltsevve.javacore.chapter08;

public class FindAreas {
    public static void main(String[] args) {
//        Figure f = new Figure(10, 10);  Нельзя создать объект после того как сделал класс абстрактным
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());

//        figref = f;
//        System.out.println("Площадь равна " + figref.area());
    }
}
