package pizza;

public class KitchenTicketBuilder implements PizzaBuilder {

    private static final String HEADER = "=== KITCHEN TICKET ===\n";
    private final StringBuilder ticket = new StringBuilder(HEADER);
    private boolean sizeSet = false;
    private boolean doughSet = false;

    @Override
    public KitchenTicketBuilder setSize(Size size) {
        ticket.append("Size: ").append(size).append("\n");
        sizeSet = true;
        return this;
    }
    @Override
    public KitchenTicketBuilder setDough(Dough dough) {
        ticket.append("Dough: ").append(dough).append("\n");
        doughSet = true;
        return this;
    }
    @Override
    public KitchenTicketBuilder setSauce(Sauce sauce) {
        ticket.append("Sauce: ").append(sauce).append("\n");
        return this;
    }
    @Override
    public KitchenTicketBuilder addTopping(String topping) {
        ticket.append("Topping: ").append(topping).append("\n");
        return this;
    }
    @Override
    public KitchenTicketBuilder setExtraCheese(boolean extraCheese) {
        if (extraCheese) {
            ticket.append("Extra cheese: YES\n");
        }
        return this;
    }
    public String getResult() {
        if (!sizeSet || !doughSet) {
            throw new IllegalStateException("Size and dough are required to cook a pizza");
        }
        return ticket.toString();
    }
}