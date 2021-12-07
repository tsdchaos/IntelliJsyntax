package comsyntax.Class26HW;

import java.util.HashSet;
import java.util.Iterator;

public class Student {
    /*
    Create a Set collection that will hold Objects of Student Type. In this set we do not care about the
    insertion order. Each student object should have name and studentID. Display name of each student.
     */
    String name;
    int id;
    Student(String name, int id) {
        this.id = id;
        this.name = name;
    }
    String displayName(){
        return name;
    }
}
class StudentTester{
    public static void main(String[] args) {
        Student alan=new Student("Alan", 5673);
        Student jack=new Student("Jack", 2935);
        Student grace=new Student("Grace", 2045);
        Student taliesin=new Student("Taliesin", 9247);

        HashSet<Student> hashSt=new HashSet<>();
        hashSt.add(alan);
        hashSt.add(jack);
        hashSt.add(grace);
        hashSt.add(taliesin);
        Iterator<Student> iterator= hashSt.iterator();
        for(int i=0; i< hashSt.size(); i++) {
            System.out.println(iterator.next().displayName());
        }
    }
}
