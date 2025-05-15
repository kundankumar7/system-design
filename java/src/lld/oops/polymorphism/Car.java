package lld.oops.polymorphism;

public class Car {

    protected String brand;
    protected String model;
    protected boolean isEngineOn;
    protected int currentSpeed;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }

    // common methods for all cars
    @SuppressWarnings("unused")
    void startEngine() {
        isEngineOn = true;
        System.out.println(brand + " : " + model + " | Engine started!");
    }

    @SuppressWarnings("unused")
    void stopEngine() {
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println(brand + " : " + model + " | Engine turned off!");
    }

    // Abstract methods for dynamic polymorphism
    @SuppressWarnings("unused")
    void accelerate() {
    }

    // Abstract method for static polymorphism
    @SuppressWarnings("unused")
    void accelerate(int speed) {
    }

    // Abstract methods for dynamic polymorphism
    @SuppressWarnings("unused")
    void applyBreak() {
    }
}
