package com.exsersice.cars;

public class Body {
    private BodyType type;
    private BodyColor color;

    Body(BodyType type, BodyColor color) throws Exception {
        setType(type);
        setColor(color);
    }

    private void setType(BodyType type) throws Exception {
        if (type == null) {
            throw new Exception("No such type found");
        }
        this.type = type;
    }

    private void setColor(BodyColor color) throws Exception {
        if (color == null){
            throw new Exception("Please select a different color");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "Body" +
                " type: " + type +
                ", color = " + color;
    }
}
