package main.java.com.maltsevve.javacore.chapter13;

class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();

        ob.i = 10;

        System.out.println("Содержимое переменной ob.i перед вызовом платформенно-ориентированного метода: " + ob.i);
        ob.test();
        System.out.println("Содержимое переменной ob.i после вызова платформенно-ориентированного метода: " + ob.i);
    }

    public native void test();

    static {
        System.loadLibrary("NativeDemo");
    }
}
