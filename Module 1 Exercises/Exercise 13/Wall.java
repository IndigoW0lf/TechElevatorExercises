package com.techelevator;

public abstract class Wall {

    //instance variables
    private String name;
    private String color;

    //constructors
    public Wall(String name, String color) {
        super();
        this.name = name;
        this.color = color;
    }
            public abstract int getArea();

    //getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}
