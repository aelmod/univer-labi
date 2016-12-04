package laba3;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Євгеній on 04.12.2016.
 */
public class Goods {
    private int id;
    private String name;
    private LocalDate date;
    private BigDecimal price;
    private int count;
    private int purchaseOrder;

    public Goods(String name, LocalDate date, BigDecimal price, int currentCount, int purchaseOrder) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.count = currentCount;
        this.purchaseOrder = purchaseOrder;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public int getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void increaseCount(int n) {
        count += n;
    }

    public void decreaseCount(int n) {
        count -= n;
    }

    public BigDecimal costOf() {
        return price.multiply(new BigDecimal(count));
    }

    @Override
    public String toString() {
        return name;
    }
}
