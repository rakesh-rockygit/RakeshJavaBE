package CircleRectangleCalc;

import java.util.Scanner;

public class CircleRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        // System.out.print("Enter width: ");
        // System.out.print("Enter height: ");

        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f%n", area);

    }
}
