package lld.oops.inheritance;

class Car {

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

    @SuppressWarnings("unused")
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

    @SuppressWarnings("unused")
    void applyBreak() {
        currentSpeed -= 20;

        if (currentSpeed < 0) {
            currentSpeed = 0;
        }

        System.out.println("Break applied! Current speed: " + currentSpeed + " km/h");
    }

    // The protected keyword works like private, but with one key difference:
    // If any class extends the class Car, they will have access to all protected variables (inherited).
    // For example, ManualCar and ElectricCar can access all the protected variables of class Car.
    // Moreover, if another class extends ManualCar or ElectricCar, they can also access the protected variables of class Car —
    // as long as they are part of the same package or they inherit them directly.
    // So, any subclass (direct or indirect) can access protected members of its superclass,
    // but protected members are NOT accessible through objects — only within inheritance or same package.

    /*
        | Access Modifier | Same Class | Same Package | Subclass (Other Package) | Other Classes |
        | --------------- | ---------- | ------------ | ------------------------ | ------------- |
        | `private`       | ✅          | ❌            | ❌                        | ❌             |
        | `default`       | ✅          | ✅            | ❌                        | ❌             |
        | `protected`     | ✅          | ✅            | ✅ (via inheritance only) | ❌             |
        | `public`        | ✅          | ✅            | ✅                        | ✅             |
     */
}
