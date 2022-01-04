package comsyntax.Class31;

public class ExceptionDemo {
    public static void main(String[] args) {
        String name=null;
        //The try/catch commands allow you to put some code that you feel might not work right. If it works right, it executes
        //If not, then the catch block executes instead
        System.out.println("Line 1");
        try{
            int num1=10;
            int num2=0;
            System.out.println(num1/num2);
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("Sending an email to alert of an error");
        }catch (IndexOutOfBoundsException f){ //You can overload the catch method
            System.out.println("Out of Bounds Exception");
        } //You need to have a catch for the appropriate Exceptions, otherwise the code won't run properly
        catch (ArithmeticException g){
            System.out.println("We can't divide by 0");
            System.out.println(g);
            System.out.println(g.getMessage());
        }
        System.out.println("Line 2");

    }
}
