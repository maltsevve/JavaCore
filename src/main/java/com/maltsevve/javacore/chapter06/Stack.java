package main.java.com.maltsevve.javacore.chapter06;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else stck[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загруженю");
            return 0;
        }
        else
            return stck[tos--];
    }
}
