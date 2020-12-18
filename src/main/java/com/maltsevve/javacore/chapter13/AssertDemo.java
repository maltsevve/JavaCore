package main.java.com.maltsevve.javacore.chapter13;

class AssertDemo {
    static int val = 3;

    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getnum();
            assert n > 0;  // чтобы заработало нужно указать -ea + абсолютный путь в параметрах:
            // edit configurations -> more options -> add VM options -> -ea "абсолютный путь"
            System.out.println("n равно " + n);
        }
    }
}
