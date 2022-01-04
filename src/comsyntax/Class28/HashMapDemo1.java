package comsyntax.Class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
    public static void main(String[] args) {
        int[] numbers={10,20,30,50}; //things are stored based on the indexes
        //hard to search, have to go through all the elements
        for(int number: numbers){
            if(number==100){
                System.out.println("Found");
            }
        }
        //Array above is inflexible
        ArrayList<Integer> integerArrayList=new ArrayList<>();
        integerArrayList.add(30);
        integerArrayList.add(50);
        integerArrayList.add(70);
        integerArrayList.add(90);
        System.out.println(integerArrayList.contains(70));
        //ArrayList still goes through a for loop when looking for elements
        //internally contains method that is doing the same. Going through all the elemts to search

        Map<Integer, String> studentsInfo=new HashMap<>();
        studentsInfo.put(10, "Alan");
        studentsInfo.put(100, "Jack");
        System.out.println(studentsInfo.get(100));
        //Using Map, you can create custom indexes
    }
}
