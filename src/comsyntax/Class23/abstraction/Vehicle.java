package comsyntax.Class23.abstraction;

public abstract class Vehicle {
    // abstract String vin_num; abstract not allowed with fields
    String vinNum;
    static int totalVehicles;
    // abstract Vehicle();
    //  Cannot have abstract with constructors
    Vehicle(String vinNum){
        totalVehicles++;
        this.vinNum=vinNum;
        System.out.println("Grandpas constructor is called");
    }
    public void printVehicleCount(){
        System.out.println(totalVehicles);
    }
    public void drive(){
        System.out.println(" Vehicle is driving");
    }
    public void stop(){
        System.out.println("Vehicle stopping");
    }
    public abstract void start();
        //We are getting an error because the class is not abstract. if the Class is abstract, the abstract method
        // cannot have a body

}
abstract class Car extends Vehicle{
    String carType;
    Car(String carType, String vinNum){
        super(vinNum);
        this.carType=carType;
        System.out.println("Parent constructor is called");
    }
    public void drive(){
        System.out.println("Car is driving");
    }
    public abstract void speed();
}
class BMW extends Car{
    String make;
    String model;
    BMW(String vinNum, String carType, String make, String model){
        super(carType, vinNum);
        this.make=make;
        this.model=model;
    }
    @Override
    public void speed() {
        System.out.println("BMW can run 300/kmph");
    }
    @Override
    public void start(){
        System.out.println("BMW can start using remote");
    }
}
class Toyota extends Car{
    String make;
    String model;
    Toyota(String vinNum, String carType, String make, String model){
        super(carType, vinNum);
        this.make=make;
        this.model=model;

    }
    @Override
    public void speed(){
        System.out.println("Toyota can go 250 kmph");
    }
    public void start(){
        System.out.println("Toyota starts using the keys");
    }
    void displayInfo(){
        System.out.println("we build "+make+" model "+model+" "+carType+" "+vinNum);
    }
}