package comsyntax.Class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo5 {
    public static void main(String[] args) throws IOException {
        //Relative path to the file always preferred
        String path="Files/Config.properties";
        //FileInputStream if reading data, FileOutputStream if inputting data
        //Reading the data in the form of raw bytes
        /*
        We should always load the data in the java program before we write the new data to that file
        using FileOutputStream to avoid losing any data
         */
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("password"));
        properties.setProperty("Server","Development");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream, "Added new Property Dev");

    }
}
