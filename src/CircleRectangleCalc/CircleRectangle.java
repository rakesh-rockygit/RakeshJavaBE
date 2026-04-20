package CircleRectangleCalc;

import java.util.Scanner;

public class CircleRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter radius: ");

        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("Area of Circle: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("perimeter: %.2f%n", perimeter);

        System.out.print("\nEnter width: ");
        double width = scanner.nextDouble();
        System.out.print("\nEnter height: ");
        double height = scanner.nextDouble();

        double rectanglearea = height * width;

        System.out.printf("area of rectangle: %.2f%n", rectanglearea);

    }
}
