import java.util.ArrayList;

public abstract class Figure {
     private double area;
     private double perimetrer;

    public static void LargestFigure(ArrayList<Figure> figures) {
        double largest = 0;
        int index = 0;
        for (int i = 0; i < figures.size(); i++) {
            if (largest < figures.get(i).getArea()) {
                largest = figures.get(i).getArea();
            }
        }
        System.out.println("Największe pole powierzchni: " + largest);
    }

    public static void LargestPerimeter(ArrayList<Figure> figures) {
        double largest = 0;
        int index = 0;
        for (int i = 0; i < figures.size(); i++) {
            if (largest < figures.get(i).getPerimetrer()) {
                largest = figures.get(i).getPerimetrer();
            }
        }
        System.out.println("Największe obwód: " + largest);
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetrer() {
        return perimetrer;
    }

    public void setPerimetrer(double perimetrer) {
        this.perimetrer = perimetrer;
    }
}

