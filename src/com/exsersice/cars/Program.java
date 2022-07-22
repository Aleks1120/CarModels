package com.exsersice.cars;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.exsersice.cars.AudiSpec.*;
import static com.exsersice.cars.BodyColor.*;
import static com.exsersice.cars.BodyType.*;
import static com.exsersice.cars.CarSpec.*;
import static com.exsersice.cars.EngineType.*;
import static com.exsersice.cars.RaceTour.*;
import static com.exsersice.cars.Type.*;

public class Program {
    public static void main(String[] args) {
        try {
            Body body1 = new Body(COUPE, BLACK);
            Body body2 = new Body(SEDAN, BLUE);
            Body body3 = new Body(CUV, BLUE);
            Body body4 = new Body(SEDAN, BLACK);
            RaceHistory race1 = new RaceHistory(DAKAR_RALLY, 2010, 2);
            RaceHistory race2 = new RaceHistory(NASCAR, 1990, 1);
            RaceHistory race3 = new RaceHistory(NASCAR, 2000, 3);
            Engine engine2 = new Engine(GASOLINE, 2.0, 174);
            Engine engine1 = new Engine(DIESEL, 3.0, 155);
            Engine engine3 = new Engine(DIESEL, 1.2, 175);
            AudiCar car1 = new AudiCar("S15", 2012, body1, engine1, STANDARD, RACE_CAR, race1);
            MercedesCar car2 = new MercedesCar("G-Klass", 2010, body2, engine2, true, false, LUXURY_CAR);
            BmwCar car3 = new BmwCar("X5", 2015, body3, engine3, LocalDate.of(2022, 12, 15), RACE_CAR, race3);
            BmwCar car4 = new BmwCar("X15", 2020, body1, engine1, LocalDate.of(681, 1, 1), RACE_CAR, race2);
//            car1.Print();
//            car4.Print();




            List<BaseCar> catalogueList = new ArrayList<>();
            catalogueList.add(car1.Print());
            catalogueList.add(car2.Print());
            catalogueList.add(car3.Print());
            catalogueList.add(car4.Print());

            System.out.println(catalogueList);


        } catch (Exception exception) {
            System.out.println("Something went wrong " + exception);
        }
    }
}

