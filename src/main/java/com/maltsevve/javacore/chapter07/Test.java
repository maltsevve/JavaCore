package main.java.com.maltsevve.javacore.chapter07;

// Объекты допускается передавать методам в качестве параметров
public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Test o) {
        if (o.a == a && o.b == b) return  true;
        else return false;
    }
}

