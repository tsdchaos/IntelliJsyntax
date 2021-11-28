package comsyntax.Class23.abstraction;

public class VehicleTester {
    public static void main(String[] args) {
        BMW bmw=new BMW("23jasd2", "sedan", "BMW", "z3 convertible");
        bmw.printVehicleCount();
        bmw.speed();
        bmw.start();
        bmw.stop();
        bmw.drive();

        Vehicle toyota=new Toyota("23ja235s2", "sedan", "Toyota", "Yaris");

    }
}
