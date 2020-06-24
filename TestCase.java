package be.vdab;

public class TestCase {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 25, 50, 50);
        Square square = new Square(15, 60, 60);
        Circle circle = new Circle(40, 100, 100);
        Triangle triangle = new Triangle(54, 25, 15, 60, 70);
        IsoScelesTriangle isoScelesTriangle = new IsoScelesTriangle(74, 65, 52, 60);

        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());
        System.out.println(isoScelesTriangle.getArea());
    }
}
