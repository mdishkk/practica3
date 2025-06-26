package legacy;

public class LegacyCircle {
    private double cx, cy, radius;
    public LegacyCircle(double cx, double cy, double radius) {
        this.cx = cx; this.cy = cy; this.radius = radius;
    }
    public void drawLegacy() {
        System.out.println("LegacyCircle at (" + cx + ", " + cy + ") r=" + radius);
    }
    public double getRadius() { return radius; }
}
