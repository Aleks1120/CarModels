package com.exsersice.cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.exsersice.cars.AudiSpec.*;
import static com.exsersice.cars.BodyColor.*;
import static com.exsersice.cars.BodyType.*;
import static com.exsersice.cars.CarSpec.*;
import static com.exsersice.cars.EngineType.*;
import static com.exsersice.cars.RaceTour.*;

public class Program {
    public static void main(String[] args) {
        try {
            Body body1 = new Body(COUPE, BLACK);
            Body body2 = new Body(SEDAN, BLUE);
            Body body3 = new Body(CUV, BLUE);
            Body body4 = new Body(SEDAN, BLACK);

            Engine engine2 = new Engine(GASOLINE, 2.0, 174);
            Engine engine1 = new Engine(DIESEL, 3.0, 155);
            Engine engine3 = new Engine(DIESEL, 1.2, 175);
            AudiCar car1 = new AudiCar("S15", 2012, body1, engine1, STANDARD, RACE_CAR);
            MercedesCar car2 = new MercedesCar("G-Klass", 2010, body2, engine2, true, false, LUXURY_CAR);
            BmwCar car3 = new BmwCar("X5", 2015, body3, engine3, LocalDate.of(2022, 12, 15), RACE_CAR);
            BmwCar car4 = new BmwCar("X15", 2020, body1, engine1, LocalDate.of(681, 1, 1), RACE_CAR);

            List<BaseCar> catalogueList = new ArrayList<>();
            catalogueList.add(car1);
            catalogueList.add(car2);
            catalogueList.add(car3);
            catalogueList.add(car4);

            System.out.println(catalogueList);


        } catch (Exception exception) {
            System.out.println("Something went wrong " + exception);
        }
    }
}

