package AddingMethod2Objects;

public class Mobile {

    int screen;
    String make;
    String model;
    String storage;
    double OS;
    String takePicture;

    public void MobilePhone() {
        takePicture();
        playGame();
        chargePhone();

    }

    // methods or properties

    private void takePicture() {
        System.out.println("can take pictures");
    }

    private void playGame() {
        System.out.println("play games ");
    }

    private void chargePhone() {
        System.out.println("charge phone when battery is dead ");
    }

    public static void main(String[] args) {
        // how we can instantiate a class

        Mobile mobile1 = new Mobile(); // instance or objects which calls for constructor
        mobile1.screen = 6;
        mobile1.make = "Apple";
        mobile1.storage = "256GB";

        Mobile mobile2 = new Mobile();
        mobile2.model = "18 pro";
        mobile2.make = "Apple";
        mobile2.OS = 27.90;

    }

}
