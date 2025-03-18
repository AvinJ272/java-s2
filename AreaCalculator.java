import java.util.Scanner;

class Shape {
 
    double area(double radius) {
        return Math.PI * radius * radius;
    }


    double area(double length, double width) {
        return length * width;
    }

    double area(double base, double height, boolean inTriangle) {
        if (inTriangle) {
            return 0.5 * base * height;
        }
        return 0;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        // Area of Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.println("Area of Circle: " + shape.area(radius));

        // Area of Rectangle
        System.out.println("Enter the length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.println("Area of Rectangle: " + shape.area(length, width));

        // Area of Triangle
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle: " + shape.area(base, height, true));

        sc.close();
    }
}
