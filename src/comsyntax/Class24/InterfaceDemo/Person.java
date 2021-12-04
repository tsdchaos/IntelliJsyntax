package comsyntax.Class24.InterfaceDemo;

public interface Person { //you cannot have abstract interfaces. They are abstract by default, so adding the abstract keyword is redundant
    void eat(); //by default, all methods inside an interface are abstract
    void sleep(); //by default, all methods in an interface are public

}
interface Employee{
    void work();
}
interface SyntaxEmployees extends Employee, Person{
    void teach();
}
class SDETInstructor implements SyntaxEmployees{ // When providing implementation for an interface, we use the implements keyword
    @Override
    public void eat(){
        System.out.println("Syntax Employees eating");
    }
    @Override
    public void sleep(){
        System.out.println("Syntax Employees sleeping");
    }

    @Override
    public void teach() {
        System.out.println("Syntax Employees teach IT");
    }

    @Override
    public void work() {
        System.out.println("Creating new repls");
    }

}
