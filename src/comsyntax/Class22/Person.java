package comsyntax.Class22;

public class Person {
    String name;
    Person(String name){
        this.name=name;
    }
    void eat(){
        System.out.println(name+" eating");
    }
    void performDailyTask(){
        System.out.println("Eat sleep repeat");
    }
}
class Employee extends Person{
    Employee(String name){ //when extending a class with a constructor (and there is no default constructor), you need to have a matching constructor in the child class
        super(name);
    }
    @Override
    void performDailyTask(){
        System.out.println(name+" Working all day in the office and reading emails at night");
    }
}
class Student extends Person{
    Student(String name){
        super(name);
    }
    @Override
    void performDailyTask(){
        System.out.println(name+" Attending the classes at day reading at night");
    }
}
class Teacher extends Person{
    Teacher(String name){
        super(name);
    }
    void performDailyTask(){
        System.out.println(name+ " Teach the students!");
    }
    void designClasses(){
        System.out.println("Create repls and design new classes");
    }
}

