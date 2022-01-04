package comsyntax.Class28;

import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        HashMap<String, Double> groceryList=new LinkedHashMap<>();
        groceryList.put("Eggs", 4.95);
        groceryList.put("Milk", 4.3);
        groceryList.put("Potato", 10.0); //'AutoWrapper does not work in wrapper classes
        groceryList.put("Steak", 4.75);
        groceryList.put("Rice", 4.3);
        System.out.println(groceryList);
        Iterator<Map.Entry<String, Double>> iterator= groceryList.entrySet().iterator(); //Both keys and values
        while(iterator.hasNext()){
            Map.Entry<String, Double> next= iterator.next();
            if(next.getKey().equals("milk")&& next.getValue()==4.3){
                iterator.remove();
            }
        }

    }
}
