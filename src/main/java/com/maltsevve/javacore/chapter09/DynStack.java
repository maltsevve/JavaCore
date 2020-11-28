package main.java.com.maltsevve.javacore.chapter09;

public class DynStack implements IntStack{
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        // если стек заполнен, выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не заружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
