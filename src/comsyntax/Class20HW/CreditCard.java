package comsyntax.Class20HW;

public class CreditCard {
 /*   Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
            Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.
 */
    double balance;
    double interest;
    CreditCard(double balance){
        this.balance=balance;
    }

    void calculateInterest(){
        interest=balance*0.15;
        System.out.println(interest);
        System.out.println(balance);
    }

}
class AX extends CreditCard{
AX(double balance){
    super(balance);
}
    @Override
    void calaculateInterest(){
    interest=balance*.05;
        System.out.println(interest);
        System.out.println(balance);
    }

}
class Visa extends CreditCard{
    Visa(double balance){
        super(balance);
    }

    void calaculateInterest(){
        interest=balance*.08;
        System.out.println(interest);
        System.out.println(balance);
    }
}
//public class CreditCardTester{
  //  public static void main(String[] args) {
    //    CreditCard creditCard=new CreditCard(10);
      //  creditCard.calculateInterest();
    //    AX ax=new AX(200);
      //  ax.calaculateInterest();
    //}
//}


