package main;

import legacy.LegacyCircle;
import adapters.CircleAdapter;
import factories.*;
import shapes.*;
import visitors.*;

public class Main {
    public static void main(String[] args) {
        // --- Abstract Factory ---
        ShapeFactory simple  = new SimpleShapeFactory();
        ShapeFactory colored = new ColoredShapeFactory();

        Shape c1 = simple.createCircle(5);
        Shape r1 = simple.createRectangle(4, 6);
        Shape c2 = colored.createCircle(3);
        Shape r2 = colored.createRectangle(2, 7);

        c1.draw(); r1.draw();
        c2.draw(); r2.draw();

        // --- Adapter ---
        LegacyCircle legacy = new LegacyCircle(0, 0, 10);
        Shape adapted = new CircleAdapter(legacy);
        adapted.draw();

        // --- Visitor ---
        ShapeVisitor areaVisitor  = new AreaVisitor();
        ShapeVisitor periVisitor  = new PerimeterVisitor();

        System.out.println("\n-- AREA --");
        c1.accept(areaVisitor);
        r1.accept(areaVisitor);
        c2.accept(areaVisitor);
        adapted.accept(areaVisitor);

        System.out.println("\n-- PERIMETER --");
        c1.accept(periVisitor);
        r1.accept(periVisitor);
        c2.accept(periVisitor);
        adapted.accept(periVisitor);
    }
}
