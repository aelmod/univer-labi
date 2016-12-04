package laba3;

/**
 * Created by Євгеній on 04.12.2016.
 */
public class Pony {

    private int id;
    private int currentCount;
    private int purchaseOrder;
    private String name;

    public Pony(int id, int currentCount, int purchaseOrder, String name) {
        this.id = id;
        this.currentCount = currentCount;
        this.purchaseOrder = purchaseOrder;
        this.name = name;
    }

    public Pony(int valueForAll) {
        this.id = valueForAll;
        this.currentCount = valueForAll;
        this.purchaseOrder = valueForAll;
        this.name = Integer.toString(valueForAll);
    }

    @Override
    public String toString() {
        String res = id+"\n"+currentCount+"\n"+purchaseOrder+"\n"+name+"\n";
        return res;
    }
}
