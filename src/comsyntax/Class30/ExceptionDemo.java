package comsyntax.Class30;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        try { //put potentially problematic code in the Try part of the code. If an error occures, it goes to the catch block
            System.out.println(10 / 2);
        } catch (Exception e) {
            System.out.println("Dividing by zero not possible in Life");
        }
        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
    }
}
