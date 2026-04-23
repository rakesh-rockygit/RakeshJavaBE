package CarObjects;

public class Car {

    public static void main(String[] args) {
        // how we can instantiate a class

        Car hondCar = new Car(); // instance or objects which calls for constructor
        hondCar.colour = "green";
        hondCar.engine = 2;

        Car toyotaCar = new Car();
        toyotaCar.wheel = 4;
        toyotaCar.version = 3.75;

        System.out.println("print something ");

    }

    // properties

    int wheel;
    int engine;
    String make;
    String colour;
    double version;

    public void car() {
        offRoad();
        travelWork();
        placeThings();
    }

    // methods

    private void offRoad() {
        System.out.println("can go camping");
    }

    private void travelWork() {
        System.out.println("travel to places ");
    }

    private void placeThings() {
        System.out.println("can place things inside");
    }

}
