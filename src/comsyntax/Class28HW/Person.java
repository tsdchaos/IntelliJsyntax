package comsyntax.Class28HW;

import java.util.Collection;
import java.util.TreeMap;

public class Person {
    // Create a Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details.
    //In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
    //Print each object details.

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    public void printDetails(){
        System.out.println("The name of the person is "+name+" "+lastName);
        System.out.println("They are "+age+" years old");
        System.out.println("They earn a yearly salary of $"+salary+" per year");
    }
}
class PersonTester{
    public static void main(String[] args) {
        TreeMap<Integer, Person> personTreeMap=new TreeMap<>();
        personTreeMap.put(1, new Person("Alan", "Shwartz", 32, 120000));
        personTreeMap.put(2, new Person("Jack", "Valin", 33, 150000));
        personTreeMap.put(3, new Person("Grace", "Shwartz", 31, 75000));

        Collection<Person> value=personTreeMap.values();
        for (Person values:value
             ) {
            values.printDetails();
        }
    }
}
