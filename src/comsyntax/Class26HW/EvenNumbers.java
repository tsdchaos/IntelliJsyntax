package comsyntax.Class26HW;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {
    //Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
    public static void main(String[] args) {
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=1; i<=50; i++){
            if(i%2==0){
                even.add(i);
            }
        }

        even.removeIf(element -> element % 5 == 0);
        System.out.println(even);
    }
}
