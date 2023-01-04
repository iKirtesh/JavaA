import java.util.Scanner;

public abstract class Shape {
    double height, width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void input() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter height : ");
        height = in.nextDouble();

        System.out.print("Enter Width : ");
        width = in.nextDouble();
    }

    public abstract double compute_area();
}





public class Rectangle extends Shape {

    double area;

    public double compute_area() {
        height = this.getHeight();
        width = this.getWidth();

        area = height * width;
        return area;
    }

}


public class Triangle extends Shape {

    double area;

    public double compute_area() {
        height = this.getHeight();
        width = this.getWidth();

        area = (height * width) / 2;
        return area;
    }

}





public class Area {

    public static void main(String[] args) {

        double area;
        Shape s;

        Rectangle r = new Rectangle();
        s = r;

        s.input();
        area = s.compute_area();

        System.out.print("Area of Rectangle : " + area);
        System.out.println();
        System.out.println();

        Triangle t = new Triangle();
        s = t;

        s.input();
        area = s.compute_area();

        System.out.print("Area of Triangle : " + area);

    }
}
