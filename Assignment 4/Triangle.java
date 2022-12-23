public class Triangle extends Shape {

    double area;

    public double compute_area() {
        height = this.getHeight();
        width = this.getWidth();

        area = (height * width) / 2;
        return area;
    }

}
