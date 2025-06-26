package shapes;

public class ColoredRectangle extends Rectangle {
    private String color;
    public ColoredRectangle(double w, double h, String color) {
        super(w, h);
        this.color = color;
    }
    @Override public void draw() {
        System.out.println(color + " Rectangle, w=" + getWidth() + ", h=" + getHeight());
    }
}
