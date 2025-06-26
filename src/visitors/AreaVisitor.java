package visitors;

import shapes.Circle;
import shapes.Rectangle;
import shapes.ShapeVisitor;

public class AreaVisitor implements ShapeVisitor {
    @Override public void visit(Circle c) {
        double area = Math.PI * c.getRadius() * c.getRadius();
        System.out.println("Area(Circle)=" + area);
    }
    @Override public void visit(Rectangle r) {
        double area = r.getWidth() * r.getHeight();
        System.out.println("Area(Rectangle)=" + area);
    }
}
