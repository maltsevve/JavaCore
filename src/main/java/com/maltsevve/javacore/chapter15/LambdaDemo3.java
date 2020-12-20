package main.java.com.maltsevve.javacore.chapter15;

class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("Число 2 является множителем 10");
        if (!isFactor.test(10, 3))
            System.out.println("Число 3 не является множителем 10");
    }
}

interface NumericTest2 {
    boolean test(int n, int d);
}
