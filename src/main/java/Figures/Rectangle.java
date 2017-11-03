package Figures;

public class Rectangle extends Figure {

    private double leftSide;

    public Rectangle(double baseSide, double leftSide) {
        super(baseSide, FigureName.Rectangle);
        this.leftSide = leftSide;
    }

    public Rectangle(double baseSide, double leftSide, FigureColour colour) {
        super(baseSide, colour, FigureName.Rectangle);
        this.leftSide = leftSide;
    }

    public double getLeftSide() {
        return leftSide;
    }

    @Override
    public String toString(){
        return String.format(super.toString()+" Base side:%.3f m; Side face:%.3f m; ",this.getBaseSide(),leftSide);
    }
    @Override
    public double area(){
        return this.getBaseSide()*this.leftSide;
    }
    @Override
    public double perimeter(){
        return 2*(this.getBaseSide()+this.leftSide);
    }
}
