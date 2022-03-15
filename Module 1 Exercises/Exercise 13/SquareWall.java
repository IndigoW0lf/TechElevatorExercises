package com.techelevator;

public class SquareWall extends RectangleWall {

    // instance variables
    private int sideLength;

    //constructors
    public SquareWall(String name, String color, int sideLength) {
        super(name, color, sideLength, sideLength);
        this.sideLength = sideLength;
    }
    //override
    @Override
    public String toString() {
        //name (sideLengthxsideLength) square
        return super.getName()+" ("+sideLength+"x"+sideLength+") square";
    }
    //getter
    public int getSideLength() {
        return sideLength;
    }
}
