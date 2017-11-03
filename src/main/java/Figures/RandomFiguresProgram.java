package Figures;

import java.util.Arrays;
import java.util.Random;
//import Figures.FigureName.getFigure;

public class RandomFiguresProgram {

    public static void main(String[] args) {

        int nuberOfFigures = 3;
        Figure[] figures = new Figure[nuberOfFigures];

        int[] figuresToCreate = randIntArr(nuberOfFigures, 5, 1);
        Object[][] data = new Object[nuberOfFigures][6];

        for (int i = 0; i < nuberOfFigures; i++) {
            int colour = randInt(11, 1);
            double baseSide = (double) randInt(20, 1);
            double leftSide = (double) randInt(20, 1);
            int leftBaseAngel = randInt(85, 10);
            int rightBaseAngel = randInt(85, 10);

            double trHeight= baseSide*Math.sin(Math.toRadians(leftBaseAngel))*Math.sin(Math.toRadians(rightBaseAngel))
                    /Math.sin(Math.toRadians(leftBaseAngel+rightBaseAngel));
            double height = 3*trHeight/4;

            data[i][0] = colour;
            data[i][1] = baseSide;
            data[i][2] = leftSide;
            data[i][3] = leftBaseAngel;
            data[i][4] = rightBaseAngel;
            data[i][5] = height;


            switch (figuresToCreate[i]) {
                case 1:
                    figures[i] = new Circle(baseSide, FigureColour.getColour(colour));
                    break;
                case 2:
                    figures[i] = new Square(baseSide, FigureColour.getColour(colour));
                    break;
                case 3:
                    figures[i] = new Rectangle(baseSide, leftSide, FigureColour.getColour(colour));
                    break;
                case 4:
                    figures[i] = new Triangle(baseSide, leftSide, leftBaseAngel, FigureColour.getColour(colour));
                    break;
                case 5:
                    figures[i] = new Trapezium(leftBaseAngel, rightBaseAngel, height, baseSide, FigureColour.getColour(colour));
                    break;
                default:
                    throw new IllegalArgumentException("Wrong figure index generated, there is no such figure!");


            }
        }


        System.out.println(Arrays.toString(figuresToCreate));

        for (int i=0;i<nuberOfFigures;++i) {
            figures[i].printFigure();

            for(int j=0;j<6;j++){
                System.out.print(data[i][j]+", ");
            }

            System.out.println();
            System.out.println();
        }
    }


    private static int randInt(int max, int min) {
        int x = max - min + 1;
        Random rnd = new Random();
        return rnd.nextInt((max - min + 1)) + min;
    }


    private static int[] randIntArr(int length, int max, int min) {
//        int[] arr = new int[length];
//        for (int i = 0; i < length; i++) {
//            arr[i]=randInt(max,min);
//        }
//        return arr;

        int[] arr = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            arr[i] = rnd.nextInt((max - min + 1)) + min;
        }
        return arr;
    }


}
