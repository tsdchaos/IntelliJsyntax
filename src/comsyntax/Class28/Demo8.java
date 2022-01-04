package comsyntax.Class28;

import java.util.*;

public class Demo8 {
    public static void main(String[] args) {
        HashMap<String, Double> groceryList=new LinkedHashMap<>();
        groceryList.put("Eggs", 4.95);
        groceryList.put("Milk", 4.3);
        groceryList.put("Potato", 10.0); //'AutoWrapper does not work in wrapper classes
        groceryList.put("Steak", 4.75);
        groceryList.put("Rice", 4.3);
        System.out.println(groceryList);
        Set<Map.Entry<String, Double>> entrySet= groceryList.entrySet(); //Both keys and values
        System.out.println(entrySet);
        for (Map.Entry<String, Double> entry:entrySet) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}
