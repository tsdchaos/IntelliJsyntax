package comsyntax.Class23.abstraction;

public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Make a phone call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPictures();
    //If there is an abstract method, the class must also be abstract
    abstract void unlockPhone();

}
class iPhone extends Phone{

    @Override
    void displayPictures(){
        System.out.println("iPhone uses Photos app to display the pictures");
    }
    @Override
    void unlockPhone(){
        System.out.println("Use FaceID to unlock the phone");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Use the Gallery appt to view pictures");
    }
    @Override
    void unlockPhone(){
        System.out.println("Use fingerprint sensor to unlock the phone");
    }
}