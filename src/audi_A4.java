public class audi_A4 extends carModels{

    public audi_A4(String model, String type, int year, String carosel, String color, String engine, double cube, int speed,
                   String spec){
        super(model, type, year, carosel, color, engine, cube, speed, spec);
    }

    @Override
    public String getModelType() {
        return " Type: ";
    }
}