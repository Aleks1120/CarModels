package com.exsersice.cars;

public abstract class BaseCar {
    BaseCar Print(){
        System.out.println();
        return null;
    }


    private Type type;
    private String model;
    private int year;
    private Body body;
    private Engine engine;

    BaseCar(Type type, String model, int year, Body body, Engine engine) throws Exception {
        this.type = type;
        setModel(model);
        setYear(year);
        setBody(body);
        setEngine(engine);
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
    private void setBody(Body body) throws Exception {
        if (body == null){
            throw new Exception("Car does not have a body");
        }
        this.body = body;
    }

    Engine getEngine() {
        return engine;
    }
    private void setEngine (Engine engine) throws Exception {
        if (engine == null){
            throw new Exception("Engine does not exist");
        }
        this.engine = engine;
    }

}
