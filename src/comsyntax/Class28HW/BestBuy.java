package comsyntax.Class28HW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BestBuy {
    public static void main(String[] args) {
    //Create a map of Best Buy store. Place
        //item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        //Retrieve all keys and values from a Best Buy map using EntrySet.
        HashMap<Integer,String> BestBuy=new HashMap<>();
        BestBuy.put(76343123,"Printer");
        BestBuy.put(78213125,"TV");
        BestBuy.put(7324237,"Laptop");
        BestBuy.put(61847326,"Camera");
        BestBuy.put(555217385,"Radio");
        Set<Map.Entry<Integer, String>> entries = BestBuy.entrySet();
        for(Map.Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Iterator<Integer> iterator= BestBuy.keySet().iterator();
        while (iterator.hasNext()){
            Integer key=iterator.next();
            System.out.println(key);
        }
        Iterator<String> iterator2= BestBuy.values().iterator();
        while (iterator2.hasNext()){
            String value=iterator2.next();
            System.out.println(value);
        }
    }
}
