package comsyntax.Class20;

public class MethodOverloading2 {
    static void add(int num1, int num2){ //we use the static keyword so we can call the method without creating the object
        System.out.println(num1+num2);
    }
    static void addD(double num1, double num2){ //even if the operation is the same, if you want to use different data types, you need to create a different name for the method (normally)
        System.out.println(num1+num2);
    }
    static void add(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }
    static void add(int[] array){ //still doing addition, but different data type, so new method name is needed
        int sum=0;
        for(int number:array){
            sum+=number;
        }
        System.out.println(sum);
    }
}
// because you are doing the same thing in all the methods, you can use the same name. The only difference is how
// many/types of parameters. Works the same way as calling constructors
