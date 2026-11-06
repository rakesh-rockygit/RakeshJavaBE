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
        chatFriends();
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

    private void chatFriends() {
        System.out.println("chat with friends");
    }

    public static void main(String[] args) {
        // how we can instantiate a class

        Mobile mobile1 = new Mobile(); // instance or objects which calls for constructor
        mobile1.screen = 6;
        mobile1.make = "Apple";
        mobile1.storage = "512GB";

        Mobile mobile2 = new Mobile();
        mobile2.model = "18 pro";
        mobile2.make = "Apple";
        mobile2.OS = 27.78;

    }
    {
System.out.println("Mobile 1: " + mobile1.make + " " + mobile1.model + " with screen size of " + mobile1.screen + " inches and storage of " + mobile1.storage);
        System.out.println("Mobile 2: " + mobile2.make + " " + mobile2.model + " with OS version " + mobile2.OS);
    }
}

