package lld.oops.encapsulation;

public class Main {

    public static void main(String[] args) {
        SportsCar myCar = new SportsCar("Ford", "Mustang");
        myCar.startEngine();
        myCar.shiftGear(1);
        myCar.accelerate();
        int currentSpeed = myCar.getCurrentSpeed();
        System.out.println("Current speed of car is " + currentSpeed + " km/h");
        myCar.shiftGear(2);
        myCar.accelerate();
        myCar.applyBreak();
        myCar.stopEngine();
    }
}
