import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        PizzaFactory pf = new PizzaFactory();
        String[] menu = {
                "Cheese",
                "Pepperoni",
                "Mushroom"
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Pizza Menu: ");
        for (String pizza: menu) {
            System.out.println("\t" + pizza + " Pizza");
        }

        try {
            System.out.print("Pick: ");
            String choosePizza = sc.next();

            boolean found = false;
            for (String pizza: menu) {
                if (choosePizza.equalsIgnoreCase(pizza)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new NotOnMenuException("Pizza not found on the menu ");
            }

            Pizza selectedPizza  = pf.createPizza(choosePizza);
            selectedPizza.prepare();
            selectedPizza.bake();
            selectedPizza.box();

        } catch (NotOnMenuException e) {
            System.out.println(e.getMessage());
        }

    }
}

class NotOnMenuException extends Exception {
    public NotOnMenuException(String s) {
        super(s);
    }
}