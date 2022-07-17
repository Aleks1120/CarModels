package com.exsersice.cars;

public class Body {
    private BodyType type;
    private BodyColor color;

    Body (BodyType type, BodyColor color){
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Body" +
                " type: " + type +
                ", color = " + color;
    }
}
