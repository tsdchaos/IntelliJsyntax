package comsyntax.Class25.collectionFramework;

import java.util.ArrayList;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects=new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");
        subjects.add("Cucubmber");
        subjects.add("Sql");
        subjects.add("Docker");
        subjects.add("AWS");
        subjects.add("Mobile Testing");
        subjects.add("Mock Interview");
        subjects.add("Dead");
        System.out.println(subjects.size()); //14
        subjects.remove(("Dead"));
        System.out.println(subjects.size()); //13
    }
}
