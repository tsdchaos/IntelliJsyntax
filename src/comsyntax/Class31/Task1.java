package comsyntax.Class31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any integer");
        try{
            int num1=input.nextInt();
            System.out.println(num1);
        }catch(InputMismatchException e){
            System.out.println("Wrong type of input!");
        }
    }
}
