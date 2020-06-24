package be.vdab;

public abstract class Shape {
    private static int count;
    public int x;
    public int y;

    public Shape() {
        count++;
    }

    public Shape(int x, int y) {
        count++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosistion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public int getCount() {
        return count;
    }
}
