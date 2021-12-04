package comsyntax.GroupProjectIndividualAssignments;

import java.util.Scanner;

public class Registration {
    //Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class.
    //After creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password.
    //Requirements:
    //Valid email consider to be only yahoo
    //Valid userName and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot contain userName.
    private String email;
    private String userName="";
    private String password="";

    public void setEmail(String email) {
        if(email.contains("yahoo.com")){
            this.email = email;
        }else {
            System.out.println("Invalid email");
        }
    }
    public void setUserName(String userName) {
        if(userName.length()<6) {
            System.out.println("User Name must be six characters or greater");

        }else{
            this.userName = userName;
        }
    }

    public void setPassword(String password) {
        if(password.toLowerCase().contains(userName) || password.length()<6){
            System.out.println("Invalid password");
        }
        else{
            this.password = password;
        }

    }
}
class registrationTester{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Registration register=new Registration();
        String userName;
        String password;
        String email;
        System.out.println("Enter your email address");
        email=input.nextLine();
        register.setEmail(email);
        System.out.println("Enter your user name");
        userName=input.nextLine();
        register.setUserName(userName);
        System.out.println("Enter your password");
        password=input.nextLine();
        register.setPassword(password);
    }
}
