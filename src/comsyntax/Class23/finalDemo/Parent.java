package comsyntax.Class23.finalDemo;

public class Parent {
    private final String NAME = "Asghar"; //you can have access modifiers alongside the final keyword
    protected final int AGE = 20;
    public final double WEIGHT = 30.5;
    final double HEIGHT = 4.3;
    static final int NO_OF_LEGS = 2; //static means it is shared across the class, so it can be used with final
    String hairColor;

    private void PRINT_NAME() { //there is no need to make private methods final, as they already can't be inherited
        System.out.println(NAME);
    }


    {
        System.out.println((AGE));
    }

    protected final void printHeight() {
        System.out.println(HEIGHT);
    }

    public final void printWeight() {
        System.out.println(WEIGHT);
    }
    public static final void printNumofLegs(){
        System.out.println(NO_OF_LEGS);
    }
 /*   static final Parent(){
        //Not allowed
    }
*/
    void printHairColor(){
        System.out.println(hairColor);
    }
}
class Child extends Parent{
    public static void printNumofLegs() {
        System.out.println("From Child: " + NO_OF_LEGS);
    }
    void printHairColor(){
        System.out.println("Black from Child");
    }
}
class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.printHairColor();
        child.printNumofLegs();
    }
}