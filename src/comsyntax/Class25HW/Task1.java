package comsyntax.Class25HW;

import java.util.ArrayList;

public class Task1 {
    /*
    Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Alan");
        names.add("Grace");
        names.add("Taliesin");
        names.add("Nancy");
        names.add("Jeff");
        System.out.println("Is the array \"names\" empty?: "+names.isEmpty());
        System.out.println("Does the array \"names\" contain the name \"Jack\"?: "+names.contains("Jack"));
        System.out.println("There are "+names.size()+" elements in the \"names\" array");
        System.out.println("They are: "+names);
    }
}
