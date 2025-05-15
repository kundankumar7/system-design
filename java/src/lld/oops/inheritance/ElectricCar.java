package lld.oops.inheritance;

class ElectricCar extends Car {

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
}
