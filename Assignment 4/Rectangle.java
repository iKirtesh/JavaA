public class Rectangle extends Shape {

    double area;

    public double compute_area() {
        height = this.getHeight();
        width = this.getWidth();

        area = height * width;
        return area;
    }

}
