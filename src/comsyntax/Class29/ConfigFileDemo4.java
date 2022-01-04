package comsyntax.Class29;

import comsyntax.Utils.ConfigReader;

import java.io.IOException;

public class ConfigFileDemo4 {
    public static void main(String[] args) throws IOException {
        System.out.println(ConfigReader.read("userName"));
        System.out.println(ConfigReader.read("Files/Drumpf.properties", "UserName"));
    }
}
