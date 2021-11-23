package comsyntax.class21.poly;

public class CarTester {
    public static void main(String[] args) {
        Car car1=new Tesla();
        car1.start();

        Car[] cars={new BMW(), new Tesla(), new Toyota()};
        for(Car car:cars){
            car.start();
            car.stop();
            car.park();
        }
    }
}
