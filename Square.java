package be.vdab;

public class Square extends Rectangle {
    private int count;

    public Square() {
        count++;
    }

    public Square(int side) {
        this.height = side;
        this.width = side;
        count++;
    }

    public Square(int side, int x, int y) {
        this.height = side;
        this.width = side;
        count++;
    }

    /*
    public Square(Square side) {
        count++;
    }
    */

    public int getSide() {
        return this.getHeight();
    }

    public void setSide(int side) {
        this.height = side;
        this.width = side;
    }

    @Override
    public void setWidth(int side) {
        this.width = side;
    }

    @Override
    public void setHeight(int side) {
        this.height = side;
    }

    @Override
    public int getCount() {
        return count;
    }
}
