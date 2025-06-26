package shapes;

public class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double w, double h) { width = w; height = h; }
    public double getWidth()  { return width;  }
    public double getHeight() { return height; }
    @Override public void draw() {
        System.out.println("Rectangle, w=" + width + ", h=" + height);
    }
    @Override public void accept(ShapeVisitor v) {
        v.visit(this);
    }
}
