package be.vdab;

public class Rectangle extends Shape {
    public final int ANGLES = 4;
    private static int count;
    public int width;
    public int height;

    Rectangle() {
        count++;
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        count++;
    }

    Rectangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        count++;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

    public void grow(int d) {
        this.width *= d;
        this.height *= d;
    }

    @Override
    public int getCount() {
        return count;
    }
}
