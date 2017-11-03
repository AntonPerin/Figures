package Figures;

public class Square extends Figure {

    public Square(double side) {
        super(side, FigureName.Square);
    }

    public Square(double side, FigureColour colour) {
        super(side, colour, FigureName.Square);
    }

    public Square() {
        super(FigureName.Square);
    }

    @Override
    public double area() {
        return Math.pow(this.getBaseSide(),2);
    }

    @Override
    public double perimeter() {
        return 4*this.getBaseSide();
    }

    @Override
    public String toString(){
        return String.format(super.toString()+" Side:%.3f m;",this.getBaseSide());
    }
}
