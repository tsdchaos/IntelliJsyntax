package comsyntax.Class28;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String, Double> groceryList=new LinkedHashMap<>();
        groceryList.put("eggs", 4.95);
        groceryList.put("milk", 3.25);
        groceryList.put("potato", 10.0); //'AutoWrapper does not work in wrapper classes
        groceryList.put("steak", 4.75);
        Iterator<String> keys= groceryList.keySet().iterator(); //map=> set=> Iterator
        while(keys.hasNext()){
            String key = keys.next();
            if(key.contains("e")){
                keys.remove();
            }
        }
        System.out.println(groceryList);
    }
}
