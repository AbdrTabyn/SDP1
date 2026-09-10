package pizza;
import java.util.Collections;
import java.util.List;

public final class Pizza {

    private final Size size;
    private final Dough dough;
    private final Sauce sauce;
    private final boolean extraCheese;
    private final List<String> toppings;

    Pizza(Size size, Dough dough, Sauce sauce, boolean extraCheese, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.sauce = sauce;
        this.extraCheese = extraCheese;
        this.toppings = Collections.unmodifiableList(toppings);
    }
    public Size getSize() { return size; }
    public Dough getDough() { return dough; }
    public Sauce getSauce() { return sauce; }
    public boolean hasExtraCheese() { return extraCheese; }
    public List<String> getToppings() { return toppings; }

    @Override
    public String toString() {
        return "Pizza[" + size + ", " + dough + ", " + sauce +
                ", extraCheese=" + extraCheese + ", toppings=" + toppings + "]";
    }
}