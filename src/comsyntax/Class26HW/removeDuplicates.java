package comsyntax.Class26HW;

import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicates {
    //How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("John"); names.add("Jane"); names.add("James");
        names.add("Jasmine"); names.add("Jane"); names.add("James");
        System.out.println("Array List \"names\"");
        System.out.println(names);
        HashSet<String> hashSet=new HashSet<>();
        hashSet.addAll(names);
        names.clear();
        names.addAll(hashSet);
        System.out.println("Same array, duplicates removed");
        System.out.println(names);

    }
}
