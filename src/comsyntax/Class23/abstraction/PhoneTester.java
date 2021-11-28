package comsyntax.Class23.abstraction;

public class PhoneTester {
    public static void main(String[] args) {
       // Phone phone=new Phone(); //can't create the object of an abstract class
        Phone[] phones={new iPhone(), new Samsung()};
        for(Phone phone2: phones){
            phone2.displayPictures();
            phone2.makePhoneCall();
            phone2.unlockPhone();
            phone2.sendText();
        }
    }
}
