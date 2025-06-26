package shapes;

public class Circle implements Shape {
    private double radius;
    public Circle(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }
    @Override public void draw() {
        System.out.println("Circle, r=" + radius);
    }
    @Override public void accept(ShapeVisitor v) {
        v.visit(this);
    }
}
