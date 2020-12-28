package main.java.com.maltsevve.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

// Класс ForkJoinTaak преобразует (через класс RecursiveAction)
// значения элементов массива типа double в их квадратные корни
class SqrtTransform extends RecursiveAction {
    // В данном примере пороговое значение произвольно устанавливается
    // равным 1000. В реальном коде его оптимальное значение может
    // быть определено в результате профилирования исполняющей системы
    // или экспериментально
    final int seqThreshold = 1000;
    double[] data;
    int start, end;

    SqrtTransform(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    // Этот метод выполняет параллельное вычисление
    @Override
    protected void compute() {
        // Если количество элементов меньше порогового значения,
        // выполнить дальнейшую обработку последовательно
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++)
                data[i] = Math.sqrt(data[i]);
        } else {
            // в противном случае продолжить разделение данных
            // на меньшие части
            int middle = (start + end) / 2;

            // запустить новые подзадачи на выполнение, используя
            // разделенные на части данные
            invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
        }
    }
}

class ForkJoinDemo {
    public static void main(String[] args) {
        // Создать пул задач
        // ForkJoinPool fjp = ForkJoinPool.commonPool();

        double[] nums = new double[100000];

        for (int i = 0; i < nums.length; i++)
            nums[i] = i;

        System.out.println("Часть исходной последовательности: ");

        for (int i = 0; i < 10; i++)
            System.out.print(nums[i] + " ");
        System.out.println();

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

       // запустить главную задачу типа ForkJoinTask на выполнение
       // fjp.invoke(task);
       task.invoke();

        System.out.println("Часть преобразованной последовательности с точностью до четырех знаков после " +
                "десятичной точки:");

        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ", nums[i]);
        }
    }
}
