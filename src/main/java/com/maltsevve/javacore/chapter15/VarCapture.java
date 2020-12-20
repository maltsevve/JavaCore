package main.java.com.maltsevve.javacore.chapter15;

// Пример захвата локальной переменной из объемлющей области действия
class VarCapture {
    public static void main(String[] args) {
        int num = 10; // Локальная переменная, которая может быть захвачена

        MyFunc myLambda = (n) -> {
            int v = num + n;
            // num++; СТРОКА НЕ ДОПУСТИМА, так как в ней значение видоизменяется
            return v;
        };

        // И следующая строка кода приведет к ошибке, поскольку в ней
        // нарушается действительно завершенное состояние переменной num
        // nun = 9;
    }
}

interface MyFunc{
    int func(int n);
}