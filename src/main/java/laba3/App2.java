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

        Pony pony1 = new Pony(1,5,10,"Rainbow Dash");
        System.out.println(pony1.getId()+"\n"+pony1.getCurrentCount()+"\n"+pony1.getPurchaseOrder()+"\n"+pony1.getName()+"\n");

        Pony pony2 = new Pony(15);
        System.out.println(pony2.toString());
    }
}
