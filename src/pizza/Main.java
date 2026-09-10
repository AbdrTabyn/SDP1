package pizza;

public class Main {

    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();
        demoObjectRepresentation(director);
        demoTicketRepresentation(director);
        demoValidation();
    }

    private static void demoObjectRepresentation(PizzaDirector director) {
        PizzaObjectBuilder builder = new PizzaObjectBuilder();
        director.makePepperoni(builder);
        Pizza pizza = builder.getResult();

        System.out.println("Pizza object");
        System.out.println(pizza);
        System.out.println();
    }

    private static void demoTicketRepresentation(PizzaDirector director) {
        System.out.println("Kitchen ticket");

        KitchenTicketBuilder pepperoniTicket = new KitchenTicketBuilder();
        director.makePepperoni(pepperoniTicket);
        System.out.println(pepperoniTicket.getResult());

        KitchenTicketBuilder margheritaTicket = new KitchenTicketBuilder();
        director.makeMargherita(margheritaTicket);
        System.out.println(margheritaTicket.getResult());
    }

    private static void demoValidation() {
        System.out.println("Check");
        try {
            PizzaObjectBuilder brokenBuilder = new PizzaObjectBuilder();
            brokenBuilder.setSauce(Sauce.BBQ);
            brokenBuilder.getResult();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}