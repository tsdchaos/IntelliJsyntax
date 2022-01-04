package comsyntax.Class26HW;

import java.util.ArrayList;
import java.util.Iterator;

public class removeE {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("Their"); words.add("They're"); words.add("Where"); words.add("Wear"); words.add("There");
        words.removeIf(element -> element.endsWith("e"));
        System.out.println(words);
    }
}
