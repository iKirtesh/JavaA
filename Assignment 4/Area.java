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
