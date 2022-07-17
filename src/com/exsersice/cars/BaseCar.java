package com.exsersice.cars;

public abstract class BaseCar {
    private Type type;
    private String model;
    private int year;
    private Body body;
    private Engine engine;

    BaseCar(Type type, String model, int year, Body body, Engine engine) throws Exception {
        this.type = type;
        setModel(model);
        setYear(year);
        this.body = body;
        this.engine = engine;
    }

    Type getType() {
        return type;
    }

    String getModel() {
        return model;
    }

    private void setModel(String model) throws Exception {
        if ( model == null || model.isEmpty()){
            throw new Exception("Expected car model to be selected");
        }
        this.model = model;

    }

    int getYear() {
        return year;
    }

    private void setYear (int year) throws Exception{
        if (year < 1990 || year > 2022 ){
            throw new Exception("Expected valid year");
        }
        this.year = year;
    }

    Body getBody() {
        return body;
    }

    Engine getEngine() {
        return engine;
    }

}
