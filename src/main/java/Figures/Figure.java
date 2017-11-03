package Figures;

public abstract class Figure {
    private FigureName name;
    private FigureColour colour;
    private double baseSide;

    public abstract double area();

    public abstract double perimeter();


    public void setColour(FigureColour colour) {
        this.colour = colour;
    }

    public void baseSide(double baseSide) {
        this.baseSide = baseSide;
    }

    public FigureName getName() {
        return name;
    }

    public FigureColour getColour() {
        return colour;
    }

    public double getBaseSide() {
        return baseSide;
    }

    public Figure(double baseSide, FigureName name) {
        this.baseSide = baseSide;
        this.name = name;
        this.colour = FigureColour.W;
    }

    public Figure(double baseSide, FigureColour colour, FigureName name) {
        this.baseSide = baseSide;
        this.colour = colour;
        this.name = name;
    }

    public Figure(FigureName name) {
        this.name = name;
        this.baseSide = 1.0;
        this.colour = FigureColour.W;
    }

    @Override
    public String toString(){
        return String.format(getName()+" - Colour:"+this.getColour().getColour()+
                "; Area:%.3f sq.m; Perimeter:%.3f m; ", this.area(),this.perimeter());
    }

    public void printFigure(){
        System.out.println(this.toString());
    }
}
