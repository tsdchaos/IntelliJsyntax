package comsyntax.Class22;

class Parent{ //by making the class final, no class can extend from it.
    final double GRAVITY; //final means that this variable CANNOT BE CHANGED! THIS IS THE FINAL VALUE OF IT
    Parent(double GRAVITY){
        this.GRAVITY=GRAVITY; //We can assign the value inside a constructor if needed
    }
    final void printGravityValue(){ //we cannot overright this method in child classes not
       //gravity=10; We can't reassign the value of the variable, since it is already FINALIZED
        System.out.println(GRAVITY);
    }
}
class Child extends Parent{ //extends Parent We cannot extend a final class
    Child(double gravity){
        super(gravity);
    }
}
public class FinalDemo {

}
