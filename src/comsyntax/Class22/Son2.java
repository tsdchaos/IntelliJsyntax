package comsyntax.Class22;

public class Son2 extends Father{
    Son2(String name){
        super(name); //since we are trying to extend from the parent class we have to use super to call the variable name from the parent class
        //If we tried to initialize the same variable name and type, we would get an error.
    }
}
