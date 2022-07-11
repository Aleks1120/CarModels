import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class testCars {
    public static void main(String[] args) {
        audi_Q7 car1 = new audi_Q7("Audi", "Q7", 2005, "crossover", "blue", "diesel", 3.0,
                177, "Standart");
        audi_R8 car2 = new audi_R8("Audi", "R8", 2007, "coupe", "white", "diesel", 5.2,
                300, "standart");
        audi_A4 car3 = new audi_A4("Audi", "A4", 2016, "sedan", "grey", "diesel", 5.2,
                152, "standart");
        audi_Q5 car4 = new audi_Q5("Audi", "Q5", 2017, "crossover", "black", "diesel", 3.0,
                313, "standart");
        audi_Q4eTron car5 = new audi_Q4eTron("Audi", "Q4 E-Tron", 2022, "coupe", "aquamarine",
                "electric", 7.2, 125, "powertrain");

        System.out.println(car1.type());
        System.out.println(car2.type());
        System.out.println(car3.type());
        System.out.println(car4.type());
        System.out.println(car5.type());


        List<carModels> catalogueList = new ArrayList<>();
        catalogueList.add(car1);
        catalogueList.add(car2);
        catalogueList.add(car3);
        catalogueList.add(car4);
        catalogueList.add(car5);

        int yearScale = 2020;
        List<carModels> declarativeModels =catalogueList.stream().filter(carModels -> carModels.getYear() <= yearScale)
                .collect(Collectors.toList());

        declarativeModels.forEach(carModels -> System.out.println(carModels.getYear()));


    }

}
