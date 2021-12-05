package comsyntax.Class25.collectionFramework;

import org.w3c.dom.ls.LSOutput;

public class Demo3 {
    public static void main(String[] args) {


        int primitiveNumber = 10;
        Integer classNumber = primitiveNumber;
        System.out.println(classNumber);
        primitiveNumber=classNumber;
        //the above is known as auto-boxing and unboxing.
        Integer number=new Integer(10); //This is called boxing. Putting a primitive inside a wrapper
        System.out.println(number);
        Integer number2=10; //results same as calling the class as above. This is autoinboxing

        int another=number.intValue(); //unboxing the longer way
        int another2=number2; //auto unboxing shorter way


    }
}
