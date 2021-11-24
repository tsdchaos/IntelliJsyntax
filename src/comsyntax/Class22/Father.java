package comsyntax.Class22;

public class Father {
    String name;
    //always write a constructor when you need to initialize a field of a class
    Father(String name){
        this.name=name;
    }
    void sleep(){
        System.out.println(name+" likes to sleep for six hours.");
    }
    void eat(){
        System.out.println(name+" likes to eat bacon");
    }
}
