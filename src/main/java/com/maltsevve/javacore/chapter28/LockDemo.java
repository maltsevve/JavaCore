package main.java.com.maltsevve.javacore.chapter28;

import java.util.concurrent.locks.ReentrantLock;

class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

class Shared2 {
    static int count = 0;
}

class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lock, String name) {
        this.lock = lock;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            System.out.println("Поток " + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток " + name + " блокирует счетчик");
            Shared2.count++;
            System.out.println("Поток " + name + ": " + Shared2.count);
            // переключение контекста, если это возможно
            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }
    }
}
