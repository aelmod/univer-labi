package laba3;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Євгеній on 04.12.2016.
 */
public class App {
    public static void main(String[] args) {
        Goods pony = new Goods("Twilight Sparkle", LocalDate.now(), new BigDecimal(155), 15, 15578);

        pony.setPrice(new BigDecimal(322));
        System.out.println("Current count: "+pony.getCount());
        pony.increaseCount(55);
        System.out.println("Current count: "+pony.getCount());
        pony.decreaseCount(1);
        System.out.println("Current count: "+pony.getCount());
        System.out.println("Cost of: "+pony.costOf());
    }
}
