package comsyntax.Class21HW;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.doHomework();
        student.attendClass();
        student.takeTest();
        SyntaxStudent synStud=new SyntaxStudent();
        synStud.writeCode();
        synStud.attendClass();
        synStud.takeTest();
        synStud.doHomework();
        Student student1=new SyntaxStudent();
        student1.doHomework();


    }
}
