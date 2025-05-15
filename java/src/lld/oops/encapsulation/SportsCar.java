package lld.oops.encapsulation;

public class SportsCar extends Car {

    // characteristics
    String brand;
    String model;
    boolean isEngineOn;
    private int currentSpeed;
    private int currentGear;

    // constructor
    public SportsCar(String brand, String model) {
        super();
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
        this.currentGear = 0;
    }

    // getters
    @SuppressWarnings("unused")
    int getCurrentSpeed() {
        return this.currentSpeed;
    }

    @SuppressWarnings("unused")
    int getCurrentGear() {
        return this.currentGear;
    }

    // setters
    @SuppressWarnings("unused")
    void setCurrentSpeed(int speed) {
        // validate and set
        if (speed > 0 && currentSpeed > 0) {
            this.currentSpeed = speed;
        }
    }

    @SuppressWarnings("unused")
    void setCurrentGear(int gear) {
        // validate and set
        if (gear > 0 && currentGear > 0) {
            this.currentGear = gear;
        }
    }

    // behaviors | methods
    @Override
    public void startEngine() {
        isEngineOn = true;
        System.out.println(
                brand + " : " + model + " | Engine starts! broom...broom..broooom!"
        );
    }

    @Override
    public void shiftGear(int gear) {
        if (!isEngineOn) {
            System.out.println(
                    brand + " : " + model + " | Engine is off! Cannot shift gear!"
            );
            return;
        }
        this.currentGear = gear;
        System.out.println(
                brand + " : " + model + " | Engine shifted to gear: " + currentGear
        );
    }

    @Override
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void accelerate() {
        if (!isEngineOn) {
            System.out.println(
                    brand + " : " + model + " | Engine is off! Cannot be accelerated!"
            );
            return;
        }
        this.currentSpeed += 20;
        System.out.println(
                brand + " : " + model + " | Accelerating to " + currentSpeed + " km/h"
        );
    }

    @Override
    public void stopEngine() {
        if (!isEngineOn) {
            System.out.println(
                    brand + " : " + model + " | Engine is off!"
            );
            return;
        }
        isEngineOn = false;
        currentGear = 0;
        currentSpeed = 0;
        System.out.print(
                "Engine is turned off!"
        );
    }

    @Override
    public void applyBreak() {
        if (isEngineOn) {
            currentSpeed -= 20;
            if (currentSpeed < 0) {
                currentSpeed = 0;
                return;
            }
            System.out.println(
                    brand + " : " + model + " | Applying Break! current speed is " + currentSpeed + " km/h"
            );
        }
    }

    // Encapsulation encapsulates characteristics and behaviors into one bundle 
    // and provides security to characteristics  and behaviors by restricting its access using access modifiers 
    // it facilitates getters and setters methods to access restricted characteristics and behaviors. 
    // It's focus is on providing security to data unlike abstraction which focuses on hiding the complex data which is of no use for normal user.
}
