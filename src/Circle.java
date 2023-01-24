public class Circle extends Figure {
    double r;
    public Circle(double r) {
        this.r = r;
        this.setArea((3.14 * r * r));
        this.setPerimetrer((2 * 3.14 * r));
    }
    }

