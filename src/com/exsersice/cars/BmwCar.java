package com.exsersice.cars;

import java.time.LocalDate;

import static com.exsersice.cars.Type.*;

public class BmwCar extends BaseCar{

    private LocalDate warranty;

    public BmwCar( String model, int year, Body body, Engine engine, LocalDate warranty){
        super(BMW, model,year,body,engine);
        this.warranty = warranty;
    }
    @Override
    public String toString(){
        return "BmwCar" +
                " " + getModel() + " " + getYear() + " " + getBody() + " " + getEngine() + "," + " warranty: "
                + warranty;
    }
}
