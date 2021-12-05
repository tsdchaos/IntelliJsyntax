package comsyntax.Class25.collectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(); //must specify the class type for the data type (Integer instead of int)
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        System.out.println(booleans);

    }
}
