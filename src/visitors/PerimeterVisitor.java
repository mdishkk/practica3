package visitors;

import shapes.Circle;
import shapes.Rectangle;
import shapes.ShapeVisitor;

public class PerimeterVisitor implements ShapeVisitor {
    @Override public void visit(Circle c) {
        double p = 2 * Math.PI * c.getRadius();
        System.out.println("Perimeter(Circle)=" + p);
    }
    @Override public void visit(Rectangle r) {
        double p = 2 * (r.getWidth() + r.getHeight());
        System.out.println("Perimeter(Rectangle)=" + p);
    }
}
