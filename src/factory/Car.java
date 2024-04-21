package factory;

public abstract class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    abstract void drive();
}
