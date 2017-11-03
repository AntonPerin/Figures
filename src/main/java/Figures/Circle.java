package Figures;

public class Circle extends Figure {

    public Circle(double radius) {
        super(radius, FigureName.Circle);
    }

    public Circle(double radius, FigureColour colour) {
        super(radius, colour, FigureName.Circle);
    }

    public Circle() {
        super(FigureName.Circle);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getBaseSide(), 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.getBaseSide();
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Radius:%.3f m;",this.getBaseSide());
    }


}
