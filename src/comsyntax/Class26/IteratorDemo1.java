package comsyntax.Class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        Iterator<String> iterator=subjects.iterator(); //Iterator allows you to run through an ArrayList
        //hasNext() tells you if there is an element in the NEXT point in the array
        //next() moves the "pointer" to the next element in the array
        //using remove() removes the element wherever the pointer currently is

        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.remove();
      //  System.out.println(iterator.next());
      //  iterator.remove();
        System.out.println(subjects);
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
        //You can only use iterator once. If you want to do it again, you need to create a new Iterator

    }
}
