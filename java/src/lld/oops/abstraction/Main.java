package lld.oops.abstraction;

public class Main {

    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("Ford", "Mustang");
        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.applyBreak();
        myCar.stopEngine();
    }
}
