package CoffeecupProperties;

public class CoffeeCup {

    // variables or properties
    int height;
    String colour;
    String design;
    double area;

    // constructor
    public CoffeeCup() {

        canDrink();
        heatMilk();

    }

    // methods or behaviours
    private void canDrink() {
        System.out.println("can drink coffee");
    }

    private void heatMilk() {
        System.out.println("heat milk before espresso");
    }

    // objects or instances
    public static void main(String[] args) {
        CoffeeCup coffee = new CoffeeCup();
        coffee.height = 7;
        coffee.colour = "white";

        CoffeeCup latte = new CoffeeCup();
        latte.colour = "coffee";
        latte.area = 14.30;
        latte.design = "waves";
    }

}
