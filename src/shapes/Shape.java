package shapes;

public interface Shape {
    void draw();
    void accept(ShapeVisitor visitor);
}
