package comsyntax.Class28;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        //Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        //Check how many entries you have?
        //Update company on a 4th floor
        //Remove company on the 7th floor
        //Print your map
        HashMap<Integer, String> building=new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "AMD");
        building.put(4, "Facebook");
        building.put(5, "Apple");
        building.put(6, "Microsoft");
        building.put(7, "NVIDIA");
        building.replace(4, "Meta");
        building.remove(7);
        System.out.println(building.size());
        System.out.println(building);
    }
}
