package com.exsersice.cars;

import static com.exsersice.cars.Type.*;

public class AudiCar extends BaseCar {
    private AudiSpec spec;

    public AudiCar( String model, int year, Body body, Engine engine, AudiSpec spec) {
        super(AUDI, model, year, body, engine);
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "AudiCar" +
                " " + getModel() + " " + getYear() + " " + getBody() + " " + getEngine() + " "
                 + spec;
    }
}
