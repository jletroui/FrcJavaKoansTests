package geom;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString() {
        return String.format("Triangle(%s, %s, %s)", a, b, c);
    }

    public Triangle translate(double tx, double ty) {
        return new Triangle(a.translate(tx, ty), b.translate(tx, ty), c.translate(tx, ty));
    }

}
