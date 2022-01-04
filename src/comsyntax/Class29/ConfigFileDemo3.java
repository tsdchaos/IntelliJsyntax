package comsyntax.Class29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo3 {
    public static void main(String[] args) throws IOException {
        //Creating a new File!!
        //location of the file inside our project
        String path="Files/Drumpf.properties";
        //creating the object of the properties
        Properties properties=new Properties();
        //adding new properties to the object
        properties.put("UserName", "User123");
        properties.put("Password", "Pass123");

        //Creating a connection to the folder or simple creating a new file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //storing the data inside the file
        properties.store(fileOutputStream, "Creating a new file");
        fileOutputStream.close();
    }
}
