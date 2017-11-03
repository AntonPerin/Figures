package Figures;

public class Triangle extends Figure {

    double leftSide;
    double rightSide;
    double rightBaseAngle;
    double leftBaseAngle;
    double vertexAngle;


    public double getLeftSide() {
        return leftSide;
    }

    public double getRightSide() {
        return rightSide;
    }

    public double getVertexAngle() {
        return vertexAngle;
    }

    public double getRightBaseAngle() {
        return rightBaseAngle;
    }

    public double getLeftBaseAngle() {
        return leftBaseAngle;
    }

    /* Evaluates length of the triangle side by two other sides and the corner between them (Cosine theorem) */
    private double side(double baseSide, double leftSide, int betweenAngel) {
        return Math.sqrt(baseSide * baseSide + leftSide * leftSide - 2 * leftSide * baseSide * Math.cos(Math.toRadians(betweenAngel)));
    }

    /* Evaluates length of the  triangle side that lays opposite rightBaseAngel (left base side) using base side length and base angels in degrees */
    private double side(double baseSide, int leftBaseAngle, int rightBaseAngle) {
        return baseSide * Math.sin(Math.toRadians(rightBaseAngle)) / Math.sin(Math.toRadians(leftBaseAngle + rightBaseAngle));
    }

    /* Evaluates alternate angel of triangle using the alternate to this angel side and other two sides of triangle (Cosine theorem) */
    private double angel(double alternateSide, double adjacentSide1, double adjacentSide2) {
        double cosA = ((adjacentSide1 * adjacentSide1) + (adjacentSide2 * adjacentSide2) - (alternateSide * alternateSide)) / (2 * adjacentSide1 * adjacentSide2);
        //Math.pow(rightSide,2)+Math.pow(this.getBaseSide(),2)-Math.pow(this.)
        return Math.acos(cosA);
    }


    private double height() {
        return this.leftSide * Math.sin(this.leftBaseAngle);
        //return height(this.leftSide, this.leftBaseAngle);
    }

    //    private double height(double leftSide, double leftBaseAngle) {
    //       return leftSide * Math.sin(leftBaseAngle);
    //    }

    /* Evaluates height lowered to the base side of triangle using half perimeter.*/
    //    private double height(double baseSide, double leftSide, double rightSide) {
    //        double pp = (baseSide + leftSide + rightSide) / 2;
    //        double hightUnderRoot = pp * (pp - baseSide) * (pp - leftSide) * (pp - rightSide);
    //        return 2 * Math.sqrt(hightUnderRoot) / baseSide;
    //    }

    //    public double height() {
    //        return height(this.getBaseSide(), this.leftSide, this.rightSide);
    //    }


    /* Defines a triangle by three sides of it */
//    public Triangle(double baseSide, double leftSide, double rightSide) {
//        super(baseSide, FigureName.Triangle);
//        this.leftSide = leftSide;
//        this.rightSide = rightSide;
//        this.rightBaseAngle = angel(leftSide, baseSide, rightSide);
//        this.leftBaseAngle = angel(rightSide, baseSide, leftSide);
//        this.vertexAngle = (Math.PI) - this.rightBaseAngle - this.leftBaseAngle;
//    }

//    public Triangle(double baseSide, double leftSide, double rightSide, FigureColour colour) {
//        super(baseSide, colour, FigureName.Triangle);
//        this.leftSide = leftSide;
//        this.rightSide = rightSide;
//        this.rightBaseAngle = angel(leftSide, baseSide, rightSide);
//        this.leftBaseAngle = angel(rightSide, baseSide, leftSide);
//        this.vertexAngle = (Math.PI) - this.rightBaseAngle - this.leftBaseAngle;
//    }

    /* Defines a triangle by two sides and corner between them */
//    public Triangle(double baseSide, double leftSide, int betweenAngel) {
//        super(baseSide, FigureName.Triangle);
//        this.leftSide = leftSide;
//        this.leftBaseAngle = Math.toRadians(betweenAngel);
//        this.rightSide = side(baseSide, leftSide, betweenAngel);
//        this.rightBaseAngle = angel(leftSide, rightSide, baseSide);
//        this.vertexAngle = Math.PI - rightBaseAngle - leftBaseAngle;
//    }

    public Triangle(double baseSide, double leftSide, int betweenAngel, FigureColour colour) {
        super(baseSide, colour, FigureName.Triangle);
        this.leftSide = leftSide;
        this.leftBaseAngle = Math.toRadians(betweenAngel);
        this.rightSide = side(baseSide, leftSide, betweenAngel);
        this.rightBaseAngle = angel(leftSide, rightSide, baseSide);
        this.vertexAngle = Math.PI - rightBaseAngle - leftBaseAngle;
    }

//    public Triangle(double baseSide, int leftBaseAngle, int rightBaseAngle) {
//        super(baseSide, FigureName.Triangle);
//        this.leftBaseAngle = Math.toRadians(leftBaseAngle);
//        this.rightBaseAngle = Math.toRadians(rightBaseAngle);
//        this.vertexAngle = Math.PI - this.leftBaseAngle - this.rightBaseAngle;
//        this.leftSide = side(baseSide, leftBaseAngle, rightBaseAngle);
//        this.rightSide = side(baseSide, rightBaseAngle, leftBaseAngle);
//    }

    public double areaPPin(double baseSide, double rightSide, double leftSide) {
        double pp = (baseSide + leftSide + rightSide) / 2;
        double hightUnderRoot = pp * (pp - baseSide) * (pp - leftSide) * (pp - rightSide);
        return Math.sqrt(hightUnderRoot);
    }

    public double areaPP() {
        return this.areaPPin(this.getBaseSide(), this.rightSide, this.leftSide);
    }

    @Override
    public double area() {
        return this.getBaseSide() * this.height() / 2;
    }
//    public double area() {
//        return this.getBaseSide() * height(this.getBaseSide(), this.leftSide, this.rightSide) / 2;
//    }

    @Override
    public double perimeter() {
        return this.getBaseSide() + leftSide + rightSide;
    }

    @Override
    public String toString() {
        double angelsSum = Math.toDegrees((leftBaseAngle + rightBaseAngle + vertexAngle));
        return String.format(super.toString() + "Sum of all angles:%.3f deg; " +
                        "%nBottom side:%.3f m; Left side:%.3f m; Right side:%.3f m; " +
                        "%nVertex angle:%.3f deg; Left base angle:%.3f deg; Right base angle:%.3f deg"
                , angelsSum, getBaseSide(), getLeftSide(), getRightSide(),
                Math.toDegrees(vertexAngle), Math.toDegrees(leftBaseAngle), Math.toDegrees(rightBaseAngle));
    }
}
