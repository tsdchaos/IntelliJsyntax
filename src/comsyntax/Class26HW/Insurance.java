package comsyntax.Class26HW;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Insurance {
    /*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
      and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class
      Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList. Using for
      loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;

    public Insurance(String insuranceName) {
    }

    abstract void getQoute();
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    public Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
        this.insuranceName=insuranceName;
    }
    @Override
    void getQoute() {
        System.out.println("For "+insuranceName+" insurance, it will cost $280 a month to insure your "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Successfully cancelled "+insuranceName+" insurance for your "+carModel);
    }
}
class Pet extends Insurance{
    String petType;
    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
        this.insuranceName=insuranceName;
    }

    @Override
    void getQoute() {
        System.out.println("With "+insuranceName+" insurance, it will cost $35 a month for insurance for your "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Successfully cancelled "+insuranceName+" insurance for your "+petType);
    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
        this.insuranceName=insuranceName;
    }

    @Override
    void getQoute() {
        System.out.println("For "+insuranceName+" insurance, it will cost you $175 a month");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Successfully cancelled "+insuranceName+" insurance");
    }
}
class Main{
    public static void main(String[] args) {
        Insurance car=new Car("Geico", "Hyundai Elantra");
        Insurance pet=new Pet("Blue Fur", "Cat");
        Insurance health=new Health("Cigna");
        ArrayList<Insurance> insList=new ArrayList<>();
        insList.add(car);
        insList.add(pet);
        insList.add(health);
        System.out.println("Accessing using Advanced for loop");
        System.out.println();
        for(Insurance i: insList){
            i.getQoute();
            i.cancelInsurance();
            System.out.println();
        }
        System.out.println("Accessing using iterator");
        System.out.println();
        Iterator<Insurance> iterator= insList.iterator();
        while(iterator.hasNext()){
            Insurance i= iterator.next();
            i.getQoute();
            i.cancelInsurance();
            System.out.println();
        }
    }
}
