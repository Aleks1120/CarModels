public class audi_Q5 extends carModels{

    public audi_Q5(String model, String type, int year, String carosel, String color, String engine, double cube, int speed,
                   String spec){
        super(model, type, year, carosel, color, engine, cube, speed, spec);
    }

    @Override
    public String getModelType() {
        return " Type: ";
    }
}
