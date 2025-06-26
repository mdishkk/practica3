package factories;

import shapes.Shape;

public interface ShapeFactory {
    Shape createCircle(double radius);
    Shape createRectangle(double width, double height);
}
