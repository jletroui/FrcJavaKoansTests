package geom;

public class Circle {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public String toString() {
        return String.format("Circle(%s, %s)", center, radius);
    }

    public Circle translate(double tx, double ty) {
        return new Circle(center.translate(tx, ty), radius);
    }
}