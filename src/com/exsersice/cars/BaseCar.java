package com.exsersice.cars;

public abstract class BaseCar {
    private Type type;
    private String model;
    private int year;
    private Body body;
    private Engine engine;

    BaseCar(Type type, String model, int year, Body body, Engine engine) {
        this.type = type;
        this.model = model;
        this.year = year;
        this.body = body;
        this.engine = engine;
    }

    Type getType() {
        return type;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    Body getBody() {
        return body;
    }

    Engine getEngine() {
        return engine;
    }
}
