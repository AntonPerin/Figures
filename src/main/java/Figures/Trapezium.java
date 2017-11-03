package Figures;

public class Trapezium extends Figure {
    double upperSide;
    double leftSide;
    double rightSide;
    double leftBaseAngle;
    double rightBaseAngle;
    double leftUpperAngle;
    double rightUpperAngle;
    double height;

    public double getUpperSide() {
        return upperSide;
    }

    public double getLeftSide() {
        return leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public double getLeftBaseAngle() {
        return leftBaseAngle;
    }

    public double getRightBaseAngel() {
        return rightBaseAngle;
    }

    public double getLeftUpperAngel() {
        return leftUpperAngle;
    }

    public double getRightUpperAngel() {
        return rightUpperAngle;
    }

    private double side(double height, int baseAngle) {
        return height / Math.sin(Math.toRadians(180-baseAngle));
    }
    /*Evaluates side of the trapezium, belaying to the given baseSideAngle in signature*/

    private double side(double baseSide, double upperSide, int baseSideAngle, int otherBaseAngel) {
        return (baseSide - upperSide) * Math.sin(Math.toRadians(otherBaseAngel))
                / Math.sin(Math.toRadians(baseSideAngle + otherBaseAngel));
    }

    public double heigh() {
        return this.leftSide * Math.sin(this.leftBaseAngle);
    }

    public Trapezium(double baseSide, double upperSide, int leftBaseAngel, int rightBaseAngle) {
        super(baseSide, FigureName.Trapezium);
        this.upperSide=upperSide;
        this.leftBaseAngle = Math.toRadians(leftBaseAngel);
        this.rightBaseAngle = Math.toRadians(rightBaseAngle);
        this.leftSide = side(baseSide, upperSide, leftBaseAngel, rightBaseAngle);
        this.rightSide = side(baseSide, upperSide, rightBaseAngle, leftBaseAngel);
        this.leftUpperAngle = Math.toRadians(180 - leftBaseAngel);
        this.rightUpperAngle = Math.toRadians(180 - rightBaseAngle);
        this.height=this.leftSide * Math.sin(this.leftBaseAngle);

    }
    public Trapezium(double baseSide, double upperSide, int leftBaseAngel, int rightBaseAngle, FigureColour colour){
        super(baseSide,colour,FigureName.Trapezium);
        this.upperSide=upperSide;
        this.leftBaseAngle = Math.toRadians(leftBaseAngel);
        this.rightBaseAngle = Math.toRadians(rightBaseAngle);
        this.leftSide = side(baseSide, upperSide, leftBaseAngel, rightBaseAngle);
        this.rightSide = side(baseSide, upperSide, rightBaseAngle, leftBaseAngel);
        this.leftUpperAngle = Math.toRadians(180 - leftBaseAngel);
        this.rightUpperAngle = Math.toRadians(180 - rightBaseAngle);
    }
    public Trapezium(int leftBaseAngle, int rightBaseAngle, double height, double baseSide, FigureColour colour){
        super(baseSide,colour,FigureName.Trapezium);
        this.height=height;
        this.leftBaseAngle = Math.toRadians(leftBaseAngle);
        this.rightBaseAngle = Math.toRadians(rightBaseAngle);
        this.leftUpperAngle = Math.toRadians(180 - leftBaseAngle);
        this.rightUpperAngle = Math.toRadians(180 - rightBaseAngle);

        this.leftSide = side(height,leftBaseAngle);
        this.rightSide = side(height, rightBaseAngle);
        this.upperSide=baseSide-
                (height*Math.sin(Math.toRadians(90-leftBaseAngle))/ Math.sin(Math.toRadians(180-leftBaseAngle)))
                -(height*Math.sin(Math.toRadians(90-rightBaseAngle))/ Math.sin(Math.toRadians(180-rightBaseAngle)));
    }

    @Override
    public double area() {
        return (this.height*this.upperSide)+((this.getBaseSide()-this.upperSide) * this.height / 2);
    }

    @Override
    public double perimeter() {
        return this.getBaseSide()+this.upperSide+this.leftSide+this.rightSide;
    }

    @Override
    public String toString(){
//        double angelsSum=Math.toDegrees(this.leftBaseAngle)
//                +Math.toDegrees(this.rightBaseAngle)
//                +Math.toDegrees(this.leftUpperAngle)
//                +Math.toDegrees(this.rightUpperAngle);
        double angelsSum=Math.toDegrees(leftBaseAngle+rightBaseAngle+leftUpperAngle+rightUpperAngle);

        return String.format(super.toString()+"Sum of all angles:%.3f deg; " +
                "%nBottom side:%.3f m; Upper side: %.3f m; Left side:%.3f m; Right side:%.3f m; Height:%.3f"+
                "%nBottom left angle:%.3f deg; Bottom right angle:%.3f deg; Upper left angle:%.3f deg; Upper right angle:%.3f deg"
                , angelsSum, getBaseSide(), this.upperSide, this.leftSide, this.rightSide, this.height,
                Math.toDegrees(leftBaseAngle),Math.toDegrees(rightBaseAngle),Math.toDegrees(leftUpperAngle),Math.toDegrees(rightUpperAngle));
    }
}
