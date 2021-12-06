package comsyntax.Class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");

  //      subjects.removeIf(element -> element.length() > 4);
        //the above lamda expression is the same as what is written below
        Iterator<String> iterator=subjects.iterator();
        while(iterator.hasNext()){
            String element=iterator.next();
            if(element.length()>4){
                iterator.remove();
            }
        }
        System.out.println(subjects);
    }
}
