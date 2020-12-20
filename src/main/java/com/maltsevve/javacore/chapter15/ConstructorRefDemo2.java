package main.java.com.maltsevve.javacore.chapter15;

interface MyFunc4<T> {
    MyClass3<T> func(T n);
}

class MyClass3<T> {
    private T val;

    MyClass3() {
        val = null;
    }

    MyClass3(T v) {
        val = v;
    }

    T getVal() {
        return val;
    }
}

class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc4<Integer> myClassCons = MyClass3<Integer>::new;

        MyClass3<Integer> mc = myClassCons.func(100);

        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
