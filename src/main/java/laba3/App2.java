package laba3;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Євгеній on 04.12.2016.
 */
public class App2 {
    public static void main(String[] args) {
        Goods pinkiePie = new Goods("Pinkie Pie", LocalDate.now(), new BigDecimal(155), 15, 15578);
        System.out.println(pinkiePie.toString());

        Pony pony = new Pony(15);
        System.out.println(pony.toString());
    }
}
