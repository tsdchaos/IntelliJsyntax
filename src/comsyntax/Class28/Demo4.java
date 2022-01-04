package comsyntax.Class28;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        TreeMap<String, Double> groceryList=new TreeMap<>();
        groceryList.put("Eggs", 4.95);
        groceryList.put("Milk", 3.25);
        groceryList.put("Potato", 10.0); //'AutoWrapper does not work in wrapper classes
        groceryList.put("Steak", 4.75);

        TreeMap<String, Double> groceryList2=new TreeMap<>();
        groceryList2.put("Soap", 1.25);
        groceryList2.put("Shampoo", 3.57);
        groceryList2.put("beer", 2.60);

        TreeMap<String, Double> groceriesList=new TreeMap<>();
        groceriesList.putAll(groceryList2);
        groceriesList.putAll(groceryList);
        System.out.println(groceriesList);
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext() )
        {
            System.out.print( it.next() + " " );
        }

    }
}
