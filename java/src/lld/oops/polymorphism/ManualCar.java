package lld.oops.polymorphism;

public class ManualCar extends Car {

    private int currentGear;

    public ManualCar(String brand, String model) {
        super(brand, model);
        this.currentGear = 0;
    }

    @SuppressWarnings("unused")
    void shiftGear(int gear) {
        this.currentGear = gear;
        System.out.println("Current gear : " + currentGear);
    }

    // dynamic polymorphism 
    @Override
    void accelerate() {
        if (!isEngineOn) {
            System.out.println(
                    brand + " : " + model + " | Engine is off! Cannot accelerate!"
            );
            return;
        }

        currentSpeed += 20;
        System.out.println("Engine accelerated! Current speed : " + currentSpeed + " km/h");
    }

    // static and dynamic polymorphism
    @Override
    void accelerate(int speed) {
        if (!isEngineOn) {
            System.out.println(
                    brand + " : " + model + " | Engine is off! Cannot accelerate!"
            );
            return;
        }

        currentSpeed += speed;
        System.out.println("Engine accelerated! Current speed : " + currentSpeed + " km/h");
    }

    @Override
    void applyBreak() {
        currentSpeed -= 20;

        if (currentSpeed < 0) {
            currentSpeed = 0;
        }

        System.out.println("Break applied! Current speed: " + currentSpeed + " km/h");
    }
}
