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

        System.out.println("Display using second way (Iterator)");
        int j=0;
        while(j<cars.size()){
            System.out.println(cars.get(j));
            j++;
        }
        Iterator<String> iterator= cars.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println("Display using third way (for: each loop)");
        for(String car: cars){
            System.out.print(car+", ");
        }
        System.out.println();
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i)+" has "+cars.get(i).length()+" characters.");
        }
    }
}
