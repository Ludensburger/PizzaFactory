public class MushroomPizza implements Pizza {
    @Override
    public void prepare() throws InterruptedException {
        System.out.println("Preparing Order -> Mushroom Pizza");
        System.out.print("Making dough");
        printDots(15);
        System.out.print("Adding a special truffle oil infusion into the sauce");
        printDots(10);
        System.out.print("Layering a medley of wild mushrooms: shiitake, oyster, and portobello");
        printDots(5);
        System.out.print("Seasoning");
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
