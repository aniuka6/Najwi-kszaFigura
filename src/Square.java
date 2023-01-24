public class Square extends Figure {
    double a;

    public Square(double a) {
        this.a = a;
        this.setArea((a * a));
        this.setPerimetrer((4 * a));
    }
}
