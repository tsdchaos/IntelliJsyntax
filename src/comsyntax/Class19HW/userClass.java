package comsyntax.Class19HW;

public class userClass {
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code
    String name;
    String mobileNum;
    userClass(String name, String mobileNum) {
        this.name = name;
        this.mobileNum = mobileNum;
    }
}
class userInfo extends userClass{
    String address;
    userInfo(String name, String mobileNum, String address){
        super(name, mobileNum);
        this.address=address;
    }
    void userDetails(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone number: "+mobileNum);
    }

    public static void main(String[] args) {
        userInfo user= new userInfo("Jack", "(703)555-5555", "1234 Fake St");
        user.userDetails();
    }

}
