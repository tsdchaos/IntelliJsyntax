package comsyntax.Class31;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try");
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println(" inside catch");
        }finally {
            System.out.println("Will always be executed");
        }
    }
}
