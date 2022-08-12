package com.exsersice.cars;

import java.util.Collections;
import java.util.List;

import static com.exsersice.cars.RaceTour.DAKAR_RALLY;
import static com.exsersice.cars.RaceTour.NASCAR;
import static com.exsersice.cars.Type.*;

public class AudiCar extends BaseCar implements Raceable {
    private AudiSpec spec;
    private CarSpec carSpec;

    public AudiCar(String model, int year, Body body, Engine engine, AudiSpec spec, CarSpec carSpec) throws Exception {
        super(AUDI, model, year, body, engine);
        this.spec = spec;
        this.carSpec = carSpec;
    }

    @Override
    public String toString() {
        return "AudiCar" +
                " " + getModel() + " " + getYear() + " " + getBody() + " " + getEngine() + " "
                + spec + " " + getRaceHistory() + " " + carSpec;
    }

    public List<RaceEvent> getRaceHistory() {
        try {

            final RaceEvent race1 = new RaceEvent(DAKAR_RALLY, 2010, 2);
            final RaceEvent race2 = new RaceEvent(NASCAR, 1990, 1);
            final RaceEvent race3 = new RaceEvent(NASCAR, 2000, 2);

            return List.of(race1, race2, race3);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return Collections.emptyList();
    }
}
