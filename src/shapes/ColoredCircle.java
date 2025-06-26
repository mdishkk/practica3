package shapes;

public class ColoredCircle extends Circle {
    private String color;
    public ColoredCircle(double r, String color) {
        super(r);
        this.color = color;
    }
    @Override public void draw() {
        System.out.println(color + " Circle, r=" + getRadius());
    }
}
