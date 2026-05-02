package RectangleClass;

public class RectangleClass {

    double width;
    double height;
    double area;
    double perimeter;
    boolean isSquare;

    public RectangleClass(double width, double height) {

        this.width = width;
        this.height = height;
        // this.area = area;
        // this.perimeter = perimeter;
        // this.isSquare = isSquare;

    }

    public double area(double width, double height) {

        return (this.width * this.height);
    }

    public double perimeter(double width, double height) {
        return 2 * (this.width + this.height);
    }

    public boolean isSquare(double width, double height) {
        return (this.width == this.height);
    }

    public String describe() {
        return area + " " + perimeter + " " + isSquare + " ";
    }

    public static void main(String[] args) {

        RectangleClass r1 = new RectangleClass(20, 15);
        RectangleClass r2 = new RectangleClass(20, 20);
        RectangleClass r3 = new RectangleClass(30, 10);
        System.out.println(r2.perimeter);
        System.out.println(r2.describe());

        r1.describe();
        r2.describe();
        r3.describe();

    }

}
