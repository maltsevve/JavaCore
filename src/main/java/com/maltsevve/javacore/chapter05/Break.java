package main.java.com.maltsevve.javacore.chapter05;

// Применение оператора break в качестве цивилизованной формы оператора qoto
// (переход по меткам)
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second; // В данном случае оператор break осуществит переход сразу
                    // в конец блока second. Последующий код в блоках third и second не будет выполняться.
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second.");
        }
    }
}
