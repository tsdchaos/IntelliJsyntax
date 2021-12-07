package comsyntax.Class26HW;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
    //Create an arraylist of cars and retrieve all the values using 3 different ways.
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Hyundai Sonata");
        cars.add("Toyota Camry");
        cars.add("Ford Fiesta");
        System.out.println("Display first way (println)");
        System.out.println(cars);
        Iterator<String> iterator= cars.iterator();
        System.out.println("Display using second way (Iterator)");
        System.out.print(iterator.next()+", ");
        System.out.print(iterator.next()+", ");
        System.out.println(iterator.next());
        System.out.println("Display using third way (for: each loop");
        for(String car: cars){
            System.out.print(car+", ");
        }
    }
}
