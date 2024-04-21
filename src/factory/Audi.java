package factory;

public class Audi extends Car {
    public Audi() {
        super("Audi");
    }

    @Override
    void drive() {
        System.out.println("Audi yarandi...");
    }
}
