import java.util.Scanner;

public class BMIcal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight = 75, height = 2.3;

        System.out.println("Enter your weight in kilograms (kg): 75");

        System.out.println("Enter your height in meters (m): 2.3");

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi > 25) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (bmi > 25) {
            System.out.println("you're overweight");
        } else {
            System.out.println("normal");
        }
        scanner.close();
    }
}
