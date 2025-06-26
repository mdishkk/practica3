package shapes;

public interface ShapeVisitor {
    void visit(Circle c);
    void visit(Rectangle r);
}
