package com.exsersice.cars;

import static com.exsersice.cars.Type.*;

public class MercedesCar extends BaseCar{
    @Override
    BaseCar Print() {
        System.out.println(" Mercedes did not participated ");
        return null;
    }

    private boolean hasAutomaticTransmission;
    private boolean hasLeatherSaloon;
    private CarSpec spec;

    public MercedesCar(String model, int year, Body body, Engine engine, boolean hasAutomaticTransmission,
                       boolean hasLeatherSaloon, CarSpec spec) throws Exception {
        super(MERCEDES, model, year, body, engine);
        this.hasAutomaticTransmission = hasAutomaticTransmission;
        this.hasLeatherSaloon = hasLeatherSaloon;
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "MercedesCar{" +
                " " + getModel() + " " + getYear() + " " + getBody() + " " + getEngine() + " " +
                "hasAutomaticTransmission=" + hasAutomaticTransmission +
                ", hasLeatherSaloon=" + hasLeatherSaloon + " , " + spec ;
    }
}
