package comsyntax.Class28HW;

import java.util.*;

public class Countries {
    public static void main(String[] args) {
        //Create a map of countries with its capital that will store countries in alphabetical order.
        //Print all keys and values from a country map using for each loop and iterator.
        //Print all values from a country map using for each loop and iterator.
        TreeMap<String, String> countries=new TreeMap<>();
        countries.put("United States", "Washington D.C.");
        countries.put("England", "London");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("Greece", "Athens");
            Set<Map.Entry<String, String>> entrySet=countries.entrySet();
        for(Map.Entry<String, String>entry:entrySet){
            System.out.println(entry.getKey()+" has the capitol city of "+entry.getValue());
        }
        Iterator<Map.Entry<String, String>> iterator=countries.entrySet().iterator();

        System.out.println("Iterator");
        while(iterator.hasNext()){
            Map.Entry<String, String> entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("*******************************");
        for (String value:countries.values()) {
            System.out.println(value);
        }
        System.out.println("*******************************");
        Iterator<String> valueIterator=countries.values().iterator();
        while(valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }
    }
}
