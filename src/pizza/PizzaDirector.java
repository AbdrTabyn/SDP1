package pizza;
public class PizzaDirector {

    public void makeMargherita(PizzaBuilder builder) {
        builder.setSize(Size.Medium)
                .setDough(Dough.Thin)
                .setSauce(Sauce.Tomato)
                .addTopping("Mozzarella")
                .addTopping("Basil");
    }
    public void makePepperoni(PizzaBuilder builder) {
        builder.setSize(Size.Large)
                .setDough(Dough.Classic)
                .setSauce(Sauce.Tomato)
                .addTopping("Pepperoni")
                .addTopping("Mozzarella")
                .setExtraCheese(true);
    }
}