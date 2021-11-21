package comsyntax.class21;

public class MethodOverloadingDemo {
    void method(int number){
        System.out.println("Hello");
        System.out.println("Java");
    }

 /*   public void method(int number){ //cannot overload by just changing the access modifier

        System.out.println(number);
        System.out.println("Hello");
        System.out.println("Java");
        return number;
    }
*/
/*    int method(int number) { //java is confused by this, since both methods have the same parameters, so java won't know which one to call

        System.out.println(number);
        System.out.println("Hello");
        System.out.println("Java");
        return number;
    }
    */

/*    static void method(int number){ //using the non-access modifier will not allow us to overload either

        System.out.println(number);
        System.out.println("Hello");
        System.out.println("Java");
        return number;
    }
*/
    void method(String name){
        System.out.println("Hello");
        System.out.println("Java");
    }
    void method(String name, int num){
        System.out.println("Hello");
        System.out.println("Java");
    }
    void method(int num, String name){
        System.out.println("Hello");
        System.out.println("Java");
    }


    public static void main(String[] args) {
        MethodOverloadingDemo md=new MethodOverloadingDemo();
            md.method(10);
            md.method(10, "Alan");
            md.method("Alan", 10);
            //the three method calling are calling different methods, based on how the sequence, number, or data type
    }
}

