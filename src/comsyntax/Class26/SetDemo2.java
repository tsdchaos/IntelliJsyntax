package comsyntax.Class26;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> hashSet=new LinkedHashSet<>();
        hashSet.add("Apples");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apples");
        hashSet.add("Apples");
        System.out.println(hashSet);
        //Look Up LinkedHashSet later
        //LinkedHashSet, class that implements Set
        //interface. It does not allow duplicates and
        //orders its elements based on the order in which
        //they were inserted.
    }
}
