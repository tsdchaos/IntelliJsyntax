package comsyntax.Class20;

public class MethodOverloading {
    static void add(int num1, int num2){ //we use the static keyword so we can call the method without creating the object
        System.out.println(num1+num2);
    }
    static void addDouble(double num1, double num2){ //even if the operation is the same, if you want to use different data types, you need to create a different name for the method (normally)
        System.out.println(num1+num2);
    }
    static void addArray(int[] array){ //still doing addition, but different data type, so new method name is needed
        int sum=0;
        for(int number:array){
            sum+=number;
        }
        System.out.println(sum);
    }
    //When the sequence, type, number, etc of variables in a method, you need a new method name. Method OVerloading allows this to be bypassed

}
