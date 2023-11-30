public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() throws InterruptedException {
        System.out.println("Preparing Order -> Pepperoni Pizza");
        System.out.print("Making dough");
        printDots(15);
        System.out.print("Adding a spicy tomato sauce");
        printDots(10);
        System.out.print("Layering spicy pepperoni slices with a touch of smoky paprika");
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
