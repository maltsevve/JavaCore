package main.java.com.maltsevve.javacore.chapter09;

class B implements A.NestedIf {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
