package main.java.com.maltsevve.javacore.chapter28;

// Расширить класс Phaser и переопределить метод onAdvance()
// таким образом, чтобы было выполнено только определенное
// количество фаз

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int PhasesCount) {
        super(parties);
        numPhases = PhasesCount - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        // Вывод данных только для демонстрации, не использовать в дальнейшем
        System.out.println("Фаза " + phase + " завершена.\n");

        if (phase == numPhases || registeredParties == 0) return true;

        return false;
    }
}

class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    MyThread3(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Запусе потоков\n");

        new MyThread3(phsr, "A");
        new MyThread3(phsr, "B");
        new MyThread3(phsr, "C");

        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");
    }
}
