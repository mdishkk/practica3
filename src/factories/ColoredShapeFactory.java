package factories;

import shapes.ColoredCircle;
import shapes.ColoredRectangle;
import shapes.Shape;

public class ColoredShapeFactory implements ShapeFactory {
    @Override public Shape createCircle(double r) {
        return new ColoredCircle(r, "Red");
    }
    @Override public Shape createRectangle(double w, double h) {
        return new ColoredRectangle(w, h, "Blue");
    }
}
