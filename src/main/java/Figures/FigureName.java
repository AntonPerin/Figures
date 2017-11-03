package Figures;

public enum FigureName {
    Circle(1),
    Square(2),
    Rectangle(3),
    Triangle(4),
    Trapezium(5);


    private int figureIndex;

    FigureName(int figureIndex) {
        this.figureIndex = figureIndex;
    }

    public static FigureName getFigure(int index){
        for(FigureName f: FigureName.values()){
            if(f.figureIndex==index) return f;
        }
        throw new IllegalArgumentException("Wrong index, there is no such figure!");
    }

}
