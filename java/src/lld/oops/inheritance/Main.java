package lld.oops.inheritance;

class Main {

    public static void main(String[] args) {
        ManualCar myManualCar = new ManualCar("Suzuki", "WagonR");
        myManualCar.startEngine();
        myManualCar.shiftGear(1); // specific to manual car
        myManualCar.accelerate();
        myManualCar.applyBreak();
        myManualCar.stopEngine();

        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model 5");
        myElectricCar.chargeBattery(); // specific to electric car
        myElectricCar.startEngine();
        myElectricCar.accelerate();
        myElectricCar.applyBreak();
        myElectricCar.stopEngine();
    }
}
