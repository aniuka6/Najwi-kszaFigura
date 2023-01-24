import java.util.ArrayList;

public class GetFigures {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Circle(6));
        figures.add(new Circle(9));
        figures.add(new Square(5));
        figures.add(new Square(7));
        figures.add(new Square(8));
        figures.add(new Rectangle(5, 7));
        figures.add(new Rectangle(8, 7));
        figures.add(new Rectangle(5, 9));

        Figure.LargestFigure(figures);
        Figure.LargestPerimeter(figures);
    }
}
