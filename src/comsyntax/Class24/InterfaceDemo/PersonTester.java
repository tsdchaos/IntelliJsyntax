package comsyntax.Class24.InterfaceDemo;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new SDETInstructor();
        person.eat();
        person.sleep();

        Employee employee=new SDETInstructor();
        employee.work();

        SyntaxEmployees syntaxEmployees=new SDETInstructor();
        syntaxEmployees.teach();
        syntaxEmployees.eat();
        syntaxEmployees.sleep();
        syntaxEmployees.work();

        SDETInstructor sdetInstructor=new SDETInstructor();
        sdetInstructor.eat();
        sdetInstructor.sleep();
        sdetInstructor.teach();
        sdetInstructor.work();
    }
}
