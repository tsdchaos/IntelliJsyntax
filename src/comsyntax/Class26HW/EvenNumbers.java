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

        Iterator<Integer> iterator= even.iterator();
        while(iterator.hasNext()){
            int element=iterator.next();
            if(element%5==0){
                iterator.remove();
            }
        }
        System.out.println(even);
    }
}
