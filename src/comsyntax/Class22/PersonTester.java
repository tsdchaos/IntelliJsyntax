package comsyntax.Class22;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Teacher("Asghar");
        //a teacher is always a person
        person.eat();
       // Teacher teacher=new Person("Person");
        //a person is not always a teacher
        //can go parent to child for casting, but not child to parent
        Person student=new Student("Alan");
        //a student is always a person

        Person[] persons={new Student("Farhad"), new Employee("Naiya"), new Teacher("Asel")}; //this is polymorphism. Creating an array of classes and behaviors
        for(Person person2: persons){
            person2.performDailyTask();
          //  person2.designClasses(); Since the Person class does not know this method, we will get an error.
            if(person2 instanceof Teacher){
                ((Teacher) person2).designClasses(); //using the instanceof keyword, we can say that if the variable ends up being part of the Teacher class, we can run a method specific to the Teacher method
            }
        }
    }
}
