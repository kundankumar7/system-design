package lld.oops.inheritance;

class ManualCar extends Car {

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
}
