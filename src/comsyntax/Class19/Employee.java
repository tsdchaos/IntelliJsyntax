package comsyntax.Class19;

public class Employee {
    int salary=30000;
    int age;
    String name;
    int baseNoDaysOff=20;
    void printSalary(){
        System.out.println(salary);
    }
    void printNoDaysOff(){
        System.out.println(baseNoDaysOff);
    }

}
class Manager extends Employee{
    int salary=50000;
    int bonus=10;
    int travelingAllowance=200;
    void printSalary(){
        super.printSalary(); //copies the method from class Employee
        System.out.println(bonus+travelingAllowance+super.salary); //adding super on a variable pulls the same variable from the parent class, overriding the variable of the same name in the child class
    }
}