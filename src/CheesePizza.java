public class CheesePizza implements Pizza {
    @Override
    public void prepare() throws InterruptedException {
        System.out.println("Preparing Order -> Cheese Pizza");
        System.out.print("Making dough");
        printDots(15);
        System.out.print("Adding Secret Sauce");
        printDots(10);
        System.out.print("Melting three different types of cheeses: cheddar, mozzarella, and parmesan");
        printDots(5);
        System.out.print("Seasoning with Italian herb mix");
        printDots(3);
    }

    @Override
    public void bake() throws InterruptedException {
        System.out.println("Into the Furnace!");
        Thread.sleep(2500);
        System.out.println("Pizza is Done!");
        Thread.sleep(2500);
    }

    @Override
    public void box() {
        System.out.println("Boxed and Sliced");
        pizzaArt();
        System.out.print(" your " + this.getClass().getSimpleName());
    }
}
