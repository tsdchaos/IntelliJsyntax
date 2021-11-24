package comsyntax.Class21HW;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new CollegeStudent(), new SyntaxStudent(), new SchoolStudent()};
        for(Student s: students){
            s.takeTest();
            s.attendClass();
            s.doHomework();
            if(s instanceof SyntaxStudent){
                ((SyntaxStudent) s).writeCode();
            }
        }


    }
}
