package comsyntax.Class28;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String, Double> groceryList=new LinkedHashMap<>();
        groceryList.put("Eggs", 4.95);
        groceryList.put("Milk", 3.25);
        groceryList.put("Potato", 10.0); //'AutoWrapper does not work in wrapper classes
        groceryList.put("Steak", 4.75);
        Set<String> keys = groceryList.keySet(); //keySet method returns the Keys in the map
        System.out.println(keys);
        Collection<Double> values= groceryList.values();
        System.out.println(values);

    }

}
