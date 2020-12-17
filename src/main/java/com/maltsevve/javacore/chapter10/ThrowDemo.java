package main.java.com.maltsevve.javacore.chapter10;

class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("демонстрация"); // управление передается в catch так как это
            // "ближайший" блок catch с совпадающим типом исключения.
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
