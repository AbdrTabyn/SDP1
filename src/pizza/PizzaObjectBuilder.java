package pizza;
import java.util.ArrayList;
import java.util.List;

public class PizzaObjectBuilder implements PizzaBuilder {

    private Size size;
    private Dough dough;
    private Sauce sauce = Sauce.BBQ;
    private boolean extraCheese;
    private final List<String> toppings = new ArrayList<>();

    @Override
    public PizzaObjectBuilder setSize(Size size) {
        this.size = size;
        return this;
    }
    @Override
    public PizzaObjectBuilder setDough(Dough dough) {
        this.dough = dough;
        return this;
    }
    @Override
    public PizzaObjectBuilder setSauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }
    @Override
    public PizzaObjectBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }
    @Override
    public PizzaObjectBuilder setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }
    public Pizza getResult() {
        if (size == null || dough == null) {
            throw new IllegalStateException("Please, choose the size and the dough");
        }
        return new Pizza(size, dough, sauce, extraCheese, toppings);
    }
}