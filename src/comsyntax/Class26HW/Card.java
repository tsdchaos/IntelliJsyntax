package comsyntax.Class26HW;

import java.util.Iterator;
import java.util.LinkedList;

public abstract class Card {
    /*
    Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes
    credit card type.  Create 3 subclasses of a Card card. Create 3 objects of different card and store them into
    LinkedList. Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String cardName;
    public abstract void interestRate();
    public abstract void creditLimit();
    Card(String cardName){
        this.cardName=cardName;
    }
    public void monthlyFee(){
        System.out.println("There is no monthly fee for a "+cardName+" card.");
    }
}
class Visa extends Card{
    Visa(String cardName){
        super(cardName);
        this.cardName=cardName;
    }
    @Override
    public void interestRate() {
        System.out.println("The interest rate on a "+cardName+" card is 2.3%");
    }

    @Override
    public void creditLimit() {
        System.out.println("The credit limit on a "+cardName+" card is $10,000");
    }
}
class masterCard extends Card{
    masterCard(String cardName){
        super(cardName);
        this.cardName=cardName;
    }
    @Override
    public void interestRate() {
        System.out.println("The interest rate on a "+cardName+" card is 5.7%");
    }

    @Override
    public void creditLimit() {
        System.out.println("The credit limit on a "+cardName+" card is $5,000");
    }
}
class AmEx extends Card{
    AmEx(String cardName){
        super(cardName);
        this.cardName=cardName;
    }
    @Override
    public void interestRate() {
        System.out.println("The interest rate on a "+cardName+" card is 4.1%");
    }

    @Override
    public void creditLimit() {
        System.out.println("The credit limit on a "+cardName+" card is $15,000");
    }
}
class cardTester{
    public static void main(String[] args) {
        Card visa=new Visa("Visa");
        Card mc=new masterCard("Master Card");
        Card amex=new AmEx("American Express");
        LinkedList<Card> cardList=new LinkedList<>();
        cardList.add(visa);
        cardList.add(mc);
        cardList.add(amex);
        System.out.println("Implemented by advanced for loop");
        System.out.println();
        for(Card card: cardList){
            card.interestRate();
            card.creditLimit();
            card.monthlyFee();
            System.out.println();
        }
        System.out.println("Implemented by for loop and iterator");
        System.out.println();
        Iterator<Card> iterator= cardList.iterator();
        for(int i=0; i<cardList.size(); i++){
            Card b=iterator.next();
            b.monthlyFee();
            b.interestRate();
            b.creditLimit();
            System.out.println();
        }
    }
}
