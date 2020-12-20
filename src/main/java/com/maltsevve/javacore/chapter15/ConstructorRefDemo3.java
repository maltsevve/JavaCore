package main.java.com.maltsevve.javacore.chapter15;

interface MyFunc5<R, T> {
    R func(T n);
}

class MyClass4<T> {
    private T val;

    MyClass4() {
        val = null;
    }

    MyClass4(T v) {
        val = v;
    }

    T getVal() {
        return val;
    }
}

class MyClass5 {
    String str;

    MyClass5() {
        str = "";
    }

    MyClass5(String s) {
        str = s;
    }

    String getVal() {
        return str;
    }
}

class ConstructorRefDemo3 {
    // Фабричный метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор,
    // принимающий один параметр типа Т. А параметр R
    // обозначает тип создаваемого объекта
    static <R, T> R myClassFactory(MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc5<MyClass4<Double>, Double> myClassCons = MyClass4<Double>::new;
        MyClass4<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("Значение val в объекте mc равно " + mc.getVal());

        MyFunc5<MyClass4<String>, String> myClassCons2 = MyClass4<String>::new;
        MyClass4<String> mc2 = myClassFactory(myClassCons2, "Лямбда");
        System.out.println("Значение val в объекте mc2 равно " + mc2.getVal());

        MyFunc5<MyClass5, String> myClassCons3 = MyClass5::new;
        MyClass5 mc3 = myClassFactory(myClassCons3, "Лямбда2");
        System.out.println("Значение str в объекте mc3 равно " + mc3.getVal());
    }
}
