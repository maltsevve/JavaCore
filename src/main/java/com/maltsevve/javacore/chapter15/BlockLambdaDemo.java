package main.java.com.maltsevve.javacore.chapter15;

class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };

        System.out.println("Факториад числа 3 равен " + factorial.func(3));
        System.out.println("Факториад числа 5 равен " + factorial.func(5));
    }
}

interface NumericFunc{
    int func(int n);
}
