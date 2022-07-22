package com.exsersice.cars;

import java.time.LocalDate;

import static com.exsersice.cars.Type.*;

public class BmwCar extends BaseCar{
    @Override
    BaseCar Print() {
        System.out.println("BMW's "
                + raceHistory);

        return null;
    }

    private LocalDate warranty;
    private CarSpec carSpec;
    private RaceHistory raceHistory;

    public BmwCar( String model, int year, Body body, Engine engine, LocalDate warranty, CarSpec carSpec, RaceHistory raceHistory) throws Exception {
        super(BMW, model,year,body,engine);
        this.warranty = warranty;
        this.carSpec = carSpec;
        this.raceHistory = raceHistory;
    }
    @Override
    public String toString(){
        return "BmwCar" +
                " " + getModel() + " " + getYear() + " " + getBody() + " " + getEngine() + "," + " warranty: "
                + warranty;
    }
}
