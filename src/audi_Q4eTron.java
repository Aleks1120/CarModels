public class audi_Q4eTron extends carModels{

    public audi_Q4eTron(String model, String type, int year, String carosel, String color, String engine, double cube, int speed,
                        String spec){
        super(model, type, year, carosel, color, engine, cube, speed, spec);
    }

    @Override
    public String getModelType() {
        return " Type: ";
    }
}
