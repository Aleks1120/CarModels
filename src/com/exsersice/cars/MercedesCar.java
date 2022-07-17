package com.exsersice.cars;

import static com.exsersice.cars.Type.*;

public class MercedesCar extends BaseCar{

    private boolean hasAutomaticTransmission;
    private boolean hasLeatherSaloon;

    public MercedesCar(String model, int year, Body body, Engine engine, boolean hasAutomaticTransmission, boolean hasLeatherSaloon) throws Exception {
        super(MERCEDES, model, year, body, engine);
        this.hasAutomaticTransmission = hasAutomaticTransmission;
        this.hasLeatherSaloon = hasLeatherSaloon;
    }

    @Override
    public String toString() {
        return "MercedesCar{" +
                " " + getModel() + " " + getYear() + " " + getBody() + " " + getEngine() + " " +
                "hasAutomaticTransmission=" + hasAutomaticTransmission +
                ", hasLeatherSaloon=" + hasLeatherSaloon ;
    }
}
