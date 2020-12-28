package main.java.com.maltsevve.javacore.chapter28;

import java.util.concurrent.Exchanger;

class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}

class MakeString implements Runnable {
    Exchanger<String> exgr;
    String str;

    MakeString(Exchanger<String> exgr) {
        this.exgr = exgr;
        str = "";
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                // Обменять заполненный буфер на пустой
                str = exgr.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger<String> exgr;
    String str;

    UseString(Exchanger<String> exgr) {
        this.exgr = exgr;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                // Обменять пустой буфер на заполненный
                str = exgr.exchange("");
                System.out.println("Получено: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
