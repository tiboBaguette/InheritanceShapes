package be.vdab;

public class Circle extends Shape {
    final int ANGLES = 0;
    private static int count;
    private int radius;

    public Circle() {
        count++;
    }

    public Circle(int radius) {
        this.radius = radius;
        count++;
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        count++;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void grow(int d) {
        this.radius *= d;
    }

    @Override
    public int getCount() {
        return count;
    }
}
