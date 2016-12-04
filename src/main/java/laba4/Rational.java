package laba4;

/**
 * Created by Євгеній on 04.12.2016.
 */
public class Rational extends Pair {
    public Rational(int a, int b) {
        super(a, b);
    }

    public Rational addition(Rational r) {
        return new Rational(this.a * r.b + this.b * r.b, this.b * r.b);
    }

    public Rational segmentation(Rational r) {
        return new Rational(this.a / r.b, this.b / r.a);
    }

    @Override
    public Pair subtract(Pair p) {
        return new Rational(this.a * p.b - this.b * p.a, this.b * p.b);
    }
}
