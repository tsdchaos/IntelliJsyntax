package comsyntax.Class26HW;

import java.util.ArrayList;
import java.util.Iterator;

public class water {
    public static void main(String[] args) {
        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Whiskey"); drinks.add("Scotch"); drinks.add("Tequila"); drinks.add("Soda"); drinks.add("Seltzer");
        Iterator<String> iterator= drinks.iterator();
        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a")|| drinks.get(i).contains("e")){
                drinks.remove(i);
                drinks.add(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}
