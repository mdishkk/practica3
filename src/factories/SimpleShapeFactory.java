package factories;

import shapes.Circle;
import shapes.Shape;
import shapes.Rectangle;

public class SimpleShapeFactory implements ShapeFactory {
    @Override public Shape createCircle(double r) { return new Circle(r); }
    @Override public Shape createRectangle(double w, double h) {
        return new Rectangle(w, h);
    }
}
