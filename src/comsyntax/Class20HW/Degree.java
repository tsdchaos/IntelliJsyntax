package comsyntax.Class20HW;

public class Degree {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
*/

    void getPrerequisite(){
        System.out.println("To get a degree, you need a highschool diploma.");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters degree, you need a Bachelors degree first");
    }
}

class Tester{
    public static void main(String[]args){
        Degree degree=new Degree();
        degree.getPrerequisite();
        Bachelors bachelors=new Bachelors();
        bachelors.getPrerequisite();
        Masters masters=new Masters();
        masters.getPrerequisite();
    }
}
