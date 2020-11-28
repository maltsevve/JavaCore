package main.java.com.maltsevve.javacore.chapter09;

// Показать что не обязательно переопределять метод интерфейса по умолчанию
class MyIFImp implements MyIF{
    @Override
    public int getNumber() {
        return 100;
    }
}
