package lld.oops.polymorphism;

public class ElectricCar extends Car {

    @SuppressWarnings("unused")
    private int batterLevel;

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.batterLevel = 100;
    }

    @SuppressWarnings("unused")
    void chargeBattery() {
        this.batterLevel = 100;
        System.out.println(brand + " : " + model + " | Battery is fully charged!");
    }

    // dynamic polymorphism
    @Override
    @SuppressWarnings("UnnecessaryReturnStatement")
    void accelerate() {
        if (!isEngineOn) {
            System.out.println(
                    brand + " : " + model + " | Engine is off! Cannot accelerate!"
            );

            return;
        }

        if (batterLevel <= 0) {
            System.out.println(
                    "Batter is dead! Cannot accelerate!"
            );

            return;
        }

        batterLevel -= 10;
        currentSpeed += 15;

        System.out.println(
                "Engine Accelerated! Current speed : " + currentSpeed + " | Battery level : " + batterLevel
        );
    }

    // static and dynamic polymorphism
    @SuppressWarnings("override")
    void accelerate(int speed) {
        if (!isEngineOn) {
            System.out.println(
                    brand + " : " + model + " | Engine is off! Cannot accelerate!"
            );

            return;
        }

        if (batterLevel <= 0) {
            System.out.println(
                    "Batter is dead! Cannot accelerate!"
            );

            return;
        }

        batterLevel -= 10 + speed;
        currentSpeed += speed;

        System.out.println(
                "Engine Accelerated! Current speed : " + currentSpeed + " | Battery level : " + batterLevel
        );
    }

    // dynamic polymorphism
    @Override
    void applyBreak() {
        currentSpeed -= 15;

        if (currentSpeed < 0) {
            currentSpeed = 0;
        }

        System.out.println(
                "Break applied! Current speed : " + currentSpeed
        );
    }
}
