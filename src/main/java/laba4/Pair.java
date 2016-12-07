package laba4;

public class Pair {
    protected int a = 0;
    protected int b = 0;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Pair subtract(Pair p) {
        return new Pair(a - p.a, b - p.b);
    }

    public boolean equality() {
        if (a == b) return true;
        return false;
    }

    public int multiplicationNumbers() {
        return a * b;
    }

    @Override
    public String toString() {
        return "(a: " + a + ", b: " + b + ")";
    }
}
