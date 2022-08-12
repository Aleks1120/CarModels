package com.exsersice.cars;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import static com.exsersice.cars.RaceTour.DAKAR_RALLY;
import static com.exsersice.cars.RaceTour.NASCAR;
import static com.exsersice.cars.Type.*;

public class BmwCar extends BaseCar implements Raceable {
    private LocalDate warranty;
    private CarSpec carSpec;

    public BmwCar(String model, int year, Body body, Engine engine, LocalDate warranty, CarSpec carSpec) throws Exception {
        super(BMW, model, year, body, engine);
        this.warranty = warranty;
        this.carSpec = carSpec;
    }

    @Override
    public String toString() {
        return "BmwCar" +
                " " + getModel() + " " + getYear() + " " + getBody() + " " + getEngine() + "," + " warranty: "
                + warranty + " " + getRaceHistory() + " " + carSpec + getRaceHistory();
    }

    public List<RaceEvent> getRaceHistory() {
        try {
            final RaceEvent race1 = new RaceEvent(DAKAR_RALLY, 2010, 2);
            final RaceEvent race2 = new RaceEvent(NASCAR, 1990, 1);
            final RaceEvent race3 = new RaceEvent(NASCAR, 2000, 3);
            return List.of(race1, race2, race3);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return Collections.emptyList();
    }
}
