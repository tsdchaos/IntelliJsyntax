package comsyntax.Class25.collectionFramework;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("TestNg");
        subjects1.add("Cucubmber");
        subjects1.add("Sql");
        subjects1.add("Docker");
        subjects1.add("AWS");
        subjects1.add("Mobile Testing");
        subjects1.add("Mock Interview");

        ArrayList<String> subjects2=new ArrayList<>();
        subjects2.add("Docker");
        subjects2.add("AWS");
        subjects2.add("Mobile Testing");
        subjects2.add("Mock Interview");

        System.out.println(subjects1);
        subjects1.removeAll(subjects2); //all array elements present in subjects 2, will be removed from subjects1
        System.out.println(subjects1);
    }
}
