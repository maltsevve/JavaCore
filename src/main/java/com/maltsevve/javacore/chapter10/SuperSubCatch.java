package main.java.com.maltsevve.javacore.chapter10;

class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключения общего класса Exception.");
        }
        /* Этот оператор catch вообще не будет достигнут, т.к.
        подкласс ArithmeticException является производным
        от класса Exception. */
//        catch (ArithmeticException e) {  ОШИБКА!
//            System.out.println("Этот код недостежим.");
//        }
    }
}
