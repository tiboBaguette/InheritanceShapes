package be.vdab;

public class Triangle extends Shape {
    public final int ANGLES = 3;
    private static int count;
    public int height;
    public int width;
    public int perpendicular;

    public Triangle() {
        count++;
    }

    public Triangle(int width, int height, int perpendicular) {
        this.width = width;
        this.height = height;
        this.perpendicular = perpendicular;
        count++;
    }

    public Triangle(int width, int height, int perpendicular, int x, int y) {
        this.width = width;
        this.height = height;
        this.perpendicular = perpendicular;
        this.x = x;
        this.y = y;
        count++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        return width + height + perpendicular;
    }

    @Override
    public int getCount() {
        return count;
    }
}
