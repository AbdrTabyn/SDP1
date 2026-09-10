package pizza;

public interface PizzaBuilder {
    PizzaBuilder setSize(Size size);
    PizzaBuilder setDough(Dough dough);
    PizzaBuilder setSauce(Sauce sauce);
    PizzaBuilder addTopping(String topping);
    PizzaBuilder setExtraCheese(boolean extraCheese);

}