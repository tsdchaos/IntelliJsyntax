package comsyntax.Class31;

import comsyntax.Class23.abstraction.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        try {
            Thread.sleep(1000);
            FileInputStream fileInputStream = new FileInputStream("fhdsjkf");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        int num1=10;
        int num2=0;
        if(num2!=0){
            System.out.println(num1/num2);
        }else{
            System.out.println("Can't divide by 0");
        }
        String name=null;
        if(name!=null){
            System.out.println(name.length());
        }else{
            System.out.println("Name variable is null");
        }

    }
}
