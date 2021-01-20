package main.java.com.maltsevve.javacore.chapter11;

// В этой программе используется синхронизированный блок
class Callme1 {
    synchronized void call(String msg) { // Модификатор synchronized позволяет
        // предотвратить доступ из других потоков когда метод уже занят потоком.
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable {
    String msg;
    final Callme1 target;
    Thread t;

    public Caller1(Callme1 target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) { // Cинхронизированный блок
            target.call(msg);
        }
    }
}

class Synch1 {
    public static void main(String[] args) {
        Callme1 target = new Callme1();
        Caller1 ob1 = new Caller1(target, "Добро пожаловать");
        Caller1 ob2 = new Caller1(target, "в синхронизированный");
        Caller1 ob3 = new Caller1(target, "мир!");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
