package laba2;

/**
 * Created by aelmod-notebook on 04.12.2016.
 */
public class App {
    public static void main(String[] args) {
        int variant = 15;
        float floatNumber = variant + 0.12f;
        System.out.format("Целое число = %d%n", variant);
        System.out.format("Действительное число = %.2f%n", floatNumber);

        System.out.format("Число %d представлено в %x %s формате с помощью спецификатора %s%n", variant, variant, "hex", "%x");
        System.out.format("Число %d представлено в %a %s формате с помощью спецификатора %s%n", variant, floatNumber, "hex", "%a");
        System.out.format("Число %d представлено в %o %s формате с помощью спецификатора %s%n", variant, variant, "octal", "%o");
        System.out.format("Число %d представлено в %d %s формате с помощью спецификатора %s%n", variant, variant, "decimal", "%d");
        System.out.format("Число %d представлено в %.2f %s формате с помощью спецификатора %s%n", variant, floatNumber, "decimal", "%f");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "\t" + (int) Math.pow(i, 2) + "\t" + (int) Math.pow(i, 3));
        }
    }
}
