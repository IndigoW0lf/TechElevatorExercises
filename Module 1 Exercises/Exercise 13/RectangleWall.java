package com.techelevator;

public class RectangleWall extends Wall {

    //instance variables
    private int length;
    private int height;

    //constructors
    public RectangleWall(String name, String color, int length, int height) {
        super(name, color);
        this.length = length;
        this.height = height;
    }

    @Override
    public int getArea() {
        return length * height;
    }

    @Override
    public String toString() {
        //name (lengthxheight) rectangle
        return super.getName() + " (" + length + "x" + height + ") rectangle";
    }

    //getters/setters
    public int getLength() {
        return length;
    }

    public int getHeight() {
            return height;
    }

}
