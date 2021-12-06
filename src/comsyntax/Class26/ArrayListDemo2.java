package comsyntax.Class26;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("TestNg");
   /*     for( i=0; i< subjects1.size(); i++){
            if(subjects1.get(i).length()>4){
                subjects1.remove(i);
            }
        }
  */      //the last element is not checked, because ArrayLists are dynamic in size, and can change during runtime
        System.out.println(subjects1);
    }
}
