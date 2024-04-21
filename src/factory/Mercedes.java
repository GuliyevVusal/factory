package factory;

public class Mercedes extends Car {
    public Mercedes() {
        super("Mercedes");
    }

    @Override
    void drive() {
        System.out.println("Mercedes yarandi....");
    }
}
