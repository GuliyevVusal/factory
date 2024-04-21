package factory;

public class Factory {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car bmw = carFactory.getCar("Bmw");
        Car audi = carFactory.getCar("Audi");
        Car mercedes = carFactory.getCar("Mercedes");

        bmw.drive(); // Bmw Yarandi.....
        audi.drive(); // Audi yarandi...
        mercedes.drive(); // Mercedes yarandi....
    }
}
