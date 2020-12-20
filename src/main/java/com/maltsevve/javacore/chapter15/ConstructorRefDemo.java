package main.java.com.maltsevve.javacore.chapter15;

interface MyFunc3 {
    MyClass2 func(int n);
}

class MyClass2 {
    private int val;

    MyClass2() {
        val = 0;
    }

    MyClass2(int v) {
        val = v;
    }

    int getVal() {
        return val;
    }
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса МyClass.
        // Метод func() из интерфейса МyFunc принимает аргумент,
        // поэтому оператор new обращается к параметризированному
        // конструктору класса МyClass, а не к его конструктору по умолчанию
        MyFunc3 myClassCons = MyClass2::new;

        // создать экземпляр класса МyClass по ссылке на его конструктор
        MyClass2 mc = myClassCons.func(100);

        // использовать только что созданный экземпляр класса МyClass
        System.out.println("Знaчeниe val в объекте mc равно " + mc.getVal());
    }
}
