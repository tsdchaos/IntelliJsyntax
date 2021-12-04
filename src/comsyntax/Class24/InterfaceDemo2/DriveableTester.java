package comsyntax.Class24.InterfaceDemo2;

public class DriveableTester {
    public static void main(String[] args) {
        Driveable driveable=new Bike();
        Driveable driveable1=new car();
        driveable.drive();
        driveable1.drive();
    }
}
