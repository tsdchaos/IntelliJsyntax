package comsyntax.Class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptioNDemo4 {
    public static void main(String[] args) {
        String path="Files/Drumpf.properties";
        File file=new File(path);
        try{
            System.out.println("Yes, file exists. I will not be getting any errors");
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch(FileNotFoundException e) {
            System.out.println("File is not present at this path");
        }

    }
}
