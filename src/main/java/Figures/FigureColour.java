package Figures;

public enum FigureColour {
    W(1, "WHITE"),
    BL(2, "BLACK"),
    R(3, "RED"),
    O(4, "ORANGE"),
    Y(5, "YELLOW"),
    G(6, "GREEN"),
    B(7, "BLUE"),
    V(8, "VIOLET"),
    P(9, "PURPLE"),
    BR(10, "BROWN"),
    PI(11, "PINK");

    private int colourIndex;
    private String colour;

    FigureColour(int index, String colour) {
        this.colourIndex = index;
        this.colour = colour;
    }

    public int getIndex() {
        return colourIndex;
    }

    public String getColour() {
        return colour;
    }


    public static FigureColour getColour(int colourIndex) {
        for (FigureColour c : FigureColour.values()) {
            if (c.colourIndex == colourIndex) return c;
        }
        throw new IllegalArgumentException("Wrong index, there is no such colour!");
    }
}