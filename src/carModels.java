public abstract class carModels {
 private String model;
 private String type;
 private int year;
 private String carosel;
 private String color;
 private String engine;
 private double cube;
 private int speed;
 private String spec;

 public carModels (String model, String type, int year, String carosel, String color, String engine, double cube, int speed,
                   String spec){
  this.model = model;
  this.type = type;
  this.year = year;
  this.carosel = carosel;
  this.color = color;
  this.engine = engine;
  this.cube = cube;
  this.speed = speed;
  this.spec = spec;
 }

 public String type(){

  return getModelType() + model + " , " + type + " , " + year+ " , " + carosel+ " , " + color
          + " , " + engine + " , " + cube + " , " + speed + " , " + spec;
 }

 public abstract String getModelType();

 public int getYear(){
  return year;
 }


}

