package factory;

public class Bmw extends Car {
    public Bmw() {
        super("Bmw");
    }

    @Override
    void drive() {
        System.out.println("Bmw Yarandi.....");
    }
}
