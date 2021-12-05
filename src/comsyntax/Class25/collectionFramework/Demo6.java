package comsyntax.Class25.collectionFramework;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        //subjects.add("Selenium");
        subjects.add("TestNg");
        subjects.add("Cucubmber");
        subjects.add("Sql");
        subjects.add("Docker");
        subjects.add("AWS");
        subjects.add("Mobile Testing");
        subjects.add("Mock Interview");
        System.out.println(subjects);
        //with arrays, if we want to add something into a specific point in the array, it will overwrite
        //with Array List, if we add something at a specific point, then it shifts everything over one space
        subjects.add(4, "Selenium");
        System.out.println(subjects);
    }
}
