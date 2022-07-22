package com.exsersice.cars;

import static com.exsersice.cars.Type.*;

public class AudiCar extends BaseCar {
    @Override
    BaseCar Print() {
        System.out.println("Audi's "
                + raceHistory);
        return null;
    }

    private AudiSpec spec;
    private CarSpec carSpec;
    private RaceHistory raceHistory;

    public AudiCar( String model, int year, Body body, Engine engine, AudiSpec spec, CarSpec carSpec, RaceHistory raceHistory) throws Exception {
        super(AUDI, model, year, body, engine);
        this.spec = spec;
        this.carSpec = carSpec;
        this.raceHistory = raceHistory;
    }

    @Override
    public String toString() {
        return "AudiCar" +
                " " + getModel() + " " + getYear() + " " + getBody() + " " + getEngine() + " "
                 + spec;
    }
}
