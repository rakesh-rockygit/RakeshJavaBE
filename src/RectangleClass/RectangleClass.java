package RectangleClass;

public class RectangleClass {

    double width;
    double height;
    // double area;
    // double perimeter;
    // boolean isSquare;

    public RectangleClass(double width, double height) {

        this.width = width;
        this.height = height;
        // this.area = area;
        // this.perimeter = perimeter;
        // this.isSquare = isSquare;

    }

    public double area() {

        return (this.width * this.height);

    }

    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    public boolean isSquare() {
        return (this.width == this.height);
    }

    public String describe() {
        return "Area: " + area() +
                ", Perimeter: " + perimeter() +
                ", Is Square: " + isSquare();
    }

    public static void main(String[] args) {

        RectangleClass r1 = new RectangleClass(20.00, 15.00);
        RectangleClass r2 = new RectangleClass(30.00, 15.00);
        RectangleClass r3 = new RectangleClass(40.00, 40.00);

        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
        System.out.println(r1.describe());
        System.out.println(r2.describe());
        System.out.println(r3.describe());

    }

}
