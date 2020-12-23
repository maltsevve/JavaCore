package main.java.com.maltsevve.javacore.chapter20;

import java.io.*;

class SerializationDemo {
    public static void main(String[] args) {
        try (ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try (ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass object2 = (MyClass) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Исключение при десериализации: " + e);
            System.exit(0);
        }
    }
}

class MyClass implements Serializable {
    String s;
    transient int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}
