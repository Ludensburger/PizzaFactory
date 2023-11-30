public class PizzaFactory {
    public Pizza createPizza(String type) {

        if(type == null) {
            return null;
        }
        if(type.equalsIgnoreCase("CHEESE")) {
            return new CheesePizza();
        }
        if(type.equalsIgnoreCase("Pepperoni")) {
            return new PepperoniPizza();
        }
        if(type.equalsIgnoreCase("MUSHROOM")) {
            return new MushroomPizza();
        }

        return null;
    }
}
