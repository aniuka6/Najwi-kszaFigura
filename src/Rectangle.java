public class Rectangle extends Figure {
    double b;
    double c;

    public Rectangle(double b, double c) {
        this.b = b;
        this.c = c;
        this.setArea((b * c));
        this.setPerimetrer((2 * b) + (2 * c));
    }
}
