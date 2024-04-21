package factory;

public class CarFactory {


    public Car getCar(String model) {
        if (model.equalsIgnoreCase("Bmw")) {
            return new Bmw();
        } else if (model.equalsIgnoreCase("Mercedes")) {
            return new Mercedes();
        } else if (model.equalsIgnoreCase("Audi")) {
            return new Audi();
        } else {
            return null;
        }
    }
}
