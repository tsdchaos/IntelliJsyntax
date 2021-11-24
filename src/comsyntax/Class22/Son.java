package comsyntax.Class22;

public class Son extends Father{
    Son(String name){
        super(name);
    }
    @Override
    void sleep(){
        System.out.println(name+" likes to sleep for 9 hours");
    }
    @Override
    void eat(){
        System.out.println(name+" likes to eat Kabob");
    }
}
