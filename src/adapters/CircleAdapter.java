package adapters;

import legacy.LegacyCircle;
import shapes.Shape;

public class CircleAdapter implements Shape {
    private final LegacyCircle legacy;
    public CircleAdapter(LegacyCircle legacy) {
        this.legacy = legacy;
    }
    @Override public void draw() {
        legacy.drawLegacy();
    }
    @Override public void accept(shapes.ShapeVisitor v) {
        // Пробуємо «приміряти» LegacyCircle до Circle 
        // або просто викликати drawLegacy і не підтримувати visitor:
        legacy.drawLegacy();
    }
}
