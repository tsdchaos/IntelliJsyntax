package comsyntax.Class18;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="Boby";
        Cat cat=new Cat();
        cat.name="Jake";
        System.out.println(dog.name);
        dog.bark();
        cat.meow();
        cat.sleep(); //can call methods from Animal Class, since the Cat Class inherited the methods from Animal

    }
}
