package comsyntax.Class26HW;

import java.util.TreeSet;

public class Countries {
    /*
    Create a Set collection in which you need to add names of the countries. In this set we want all objects to be
    sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
     */
    public static void main(String[] args) {
        TreeSet<String> countries=new TreeSet<>();
        countries.add("United States of America");
        countries.add("Canada");
        countries.add("Saudi Arabia");
        countries.add("France");
        countries.add("Italy");
        countries.add("Brazil");
        countries.add("Ukraine");
        System.out.println(countries);
        for(String country: countries){
            System.out.println(country);
        }
    }
}
