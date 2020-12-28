package main.java.com.maltsevve.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread1(cb, "A");
        new MyThread1(cb, "B");
        new MyThread1(cb, "C");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // продемострировать возможность повторного использования CyclicBarrier:
        new MyThread1(cb, "E");
        new MyThread1(cb, "F");
        new MyThread1(cb, "G");
    }
}

class MyThread1 implements Runnable {
    CyclicBarrier cb;
    String name;

    MyThread1(CyclicBarrier cb, String name) {
        this.cb = cb;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            cb.await();
        } catch (BrokenBarrierException | InterruptedException e) {
            System.out.println(e);
        }
    }
}

class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}
