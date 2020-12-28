package main.java.com.maltsevve.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum1 extends RecursiveTask<Double> {
    final int seqThresHold = 500;
    double[] data;
    int start, end;

    public Sum1(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    // определить сумму значений элементов в массиве типа double
    @Override
    protected Double compute() {
        double sum = 0;

        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) sum += data[i];
        } else {
            int middle = (start + end) / 2;

            // запустить новые подзадачи на выполнение, используя
            // разделенные на части данные
            Sum1 subTaskA = new Sum1(data, start, middle);
            Sum1 subTaskB = new Sum1(data, middle, end);

//            subTaskA.fork();
//            subTaskB.fork();
//            sum = subTaskA.join() + subTaskB.join();

//            или:

//            sum = subTaskA.compute() + subTaskB.compute();

//            или:
            sum = subTaskA.invoke() + subTaskB.invoke();
        }

        return sum;
    }
}

class RecurTaskDemo {
    public static void main(String[] args) {
        //создать пул задач
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[5000];

        // инициализировать массив nums чередующимися
        // положительными и отрицательными значениями
        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i % 2) == 0) ? i : -i);

        Sum1 task = new Sum1(nums, 0, nums.length);

        // Запустить задачи типа ForkJoinTask. Обратите
        // внимание на то, что в данном случае метод invoke()
        // возвращает результат
        double summation = fjp.invoke(task);

        System.out.println("Суммирование " + summation);
    }
}
