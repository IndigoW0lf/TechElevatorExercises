package com.techelevator;

public class TriangleWall extends Wall{

    // instance variables
    private int base;
    private int height;

    // constructors
    public TriangleWall(String name, String color, int base, int height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }
    // methods
    public int getArea(){
        return ((base * height) / 2);
    }

    public String toString() {
        //name (basexheight) triangle
        return super.getName() + " (" + base + "x" + height + ") triangle";
    }

    //getters/setters
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
    }


}
