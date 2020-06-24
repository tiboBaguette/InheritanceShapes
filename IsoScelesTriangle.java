package be.vdab;

public class IsoScelesTriangle extends Triangle {
    private static int count;

    public IsoScelesTriangle() {
        count++;
    }

    public IsoScelesTriangle(int width, int height) {
        this.width = width;
        this.height = height;
        count++;
    }

    public IsoScelesTriangle(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        count++;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public int getCount() {
        return count;
    }
}
