import java.util.Scanner;

public abstract class Shape {
    double height, width , radius;

    public double getHeight(){
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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height :");
        height = sc.nextDouble();

        System.out.println("Enter the width :");
        width = sc.nextDouble();

        System.out.println("Enter the radius :");
        radius = sc.nextDouble();
    }

    public abstract double compute_area();

}
public class Rectangle extends Shape {

    double area;

    public double compute_area(){
        height = this.getHeight();
        width = this.getWidth();

        area = height * width;
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

        System.out.println("Area of Rectangle :" + area);

    }
}


