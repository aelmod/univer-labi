package laba4;

/**
 * Created by Євгеній on 04.12.2016.
 */
public class App {
    public static void main(String[] args) {
        Pair p1 = new Pair(4,4);
        Pair p2 = new Pair(3,8);

        System.out.println(p1.multiplicationNumbers());
        System.out.println(p1.equality());
        Pair res = p1.subtract(p2);
        System.out.printf("Pair subtract: %nPair%s - Pair%s = Pair%s%n", p1, p2, res);


        Rational r1 = new Rational(999, 9994);
        Rational r2 = new Rational(66, 33);
        Rational res1 = r1.addition(r2);
        Rational res2 = (Rational) r1.subtract(r2);
        Rational res3 = r1.segmentation(r2);
        System.out.printf("Rational addition: %nPair%s - Pair%s = Pair%s%n", r1, r2, res1);
        System.out.printf("Rational segmentation: %nPair%s - Pair%s = Pair%s%n", r1, r2, res3);
        System.out.printf("Rational subtract: %nPair%s - Pair%s = Pair%s%n", r1, r2, res2);
    }
}
