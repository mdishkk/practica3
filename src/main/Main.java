package main;

import legacy.LegacyCircle;
import adapters.CircleAdapter;
import factories.*;
import shapes.*;

public class Main {
    public static void main(String[] args) {
        ShapeFactory f1 = new SimpleShapeFactory();
        Shape c1 = f1.createCircle(5);
        Shape r1 = f1.createRectangle(4, 6);
        c1.draw(); r1.draw();

        ShapeFactory f2 = new ColoredShapeFactory();
        Shape c2 = f2.createCircle(3);
        Shape r2 = f2.createRectangle(2, 7);
        c2.draw(); r2.draw();

        LegacyCircle legacy = new LegacyCircle(0,0,10);
        Shape adapted = new CircleAdapter(legacy);
        adapted.draw();

        // Visitor можна теж окремо винести у файли shapes/AreaVisitor.java, shapes/PerimeterVisitor.java
        // або створити тут анонімні класи.
    }
}
