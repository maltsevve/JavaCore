package main.java.com.maltsevve.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Исходный список: " + myList);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent())
            System.out.println("Минимальное значение: " + minVal.get());

        // Так как операция min выше в коде оконечная и предыдущий поток
        // употреблен необходимо присвоить новый поток данных
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent())
            System.out.println("Максимальное значение: " + maxVal.get());

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Остортированный поток данных: ");
        sortedStream.forEach((n)-> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.println("Нечетные значения: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        // вывести только те нечетные целочисленные значения,
        // которые больше 5. Обратите внимание на конвейеризацию
        // обеих операций фильтрации

        oddVals = myList.stream().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        System.out.println("Нечетные значения больше пяти: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
