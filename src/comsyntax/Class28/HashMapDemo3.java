package comsyntax.Class28;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashMapDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students=new LinkedHashMap<>();
        students.put(1, "Alan");
        students.put(2, "Jack");
        students.put(17, "Anna");
        students.put(10, "Grace");
        students.put(10, "Stewart");    //maps cannot have duplicate keys. If you use the same key, then the value is overwritten
        students.put(20, "Dennis");
        students.put(100, "Henock");
        System.out.println(students);

    }
}
