package comsyntax.GroupProjectIndividualAssignments;

public class Car {
    //Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice() which should be returning a price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of
    // calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    double carPrice;
    String color;
    double calculateSalePrice(){
        return carPrice;
    }
    Car(){}

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
}
class Sedan extends Car{

    int length;
    double discount;

    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length = length;
        System.out.println("The "+color+" sedan is going to cost $"+calculateSalePrice());
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            discount=.95;
        }else{
            discount=.9;
        }
        carPrice=carPrice*discount;
        return carPrice;
    }
}
class Truck extends Car{
    int weight;
    double discount;

    public Truck(double carPrice, String color, int weight) {
        super(carPrice, color);
        this.weight = weight;
        System.out.println("The "+color+" truck is going to cost $"+calculateSalePrice());
    }

    @Override
    double calculateSalePrice() {
        if(weight>2000){
            discount=.8;
        }else{
            discount=.9;
        }
        carPrice=carPrice*discount;
        return carPrice;
    }
}
class carTester{
    public static void main(String[] args) {
        Car sedan=new Sedan(29000, "Black", 24);
        Car truck=new Truck(35000, "Blue", 1800);
    }
}