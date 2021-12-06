package comsyntax.Class26;

import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Apples");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apples");
        hashSet.add("Apples");
        System.out.println(hashSet);
        //HashSet does not allow duplicate elements
        LinkedList<String> hashSet1=new LinkedList<>();
        hashSet1.add("Apples");
        hashSet1.add("Mango");
        hashSet1.add("Kiwi");
        hashSet1.add("Apples");
        hashSet1.add("Apples");
        System.out.println(hashSet1);
        //LinkedList allows duplicates
    }
}
