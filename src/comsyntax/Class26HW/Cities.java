package comsyntax.Class26HW;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Cities {
    /*
    Create a Set of cities in which you want to make sure that insertion order is maintained.
    Then remove any city that starts with “A”;
     */
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Atlanta");
        cities.add("Los Angeles");
        cities.add("New York City");
        cities.add("Hartford");
        cities.add("Alexandria");
        cities.add("Arlington");
        cities.add("Dallas");
        cities.removeIf(element -> element.startsWith("A"));
        System.out.println(cities);
    }
}
