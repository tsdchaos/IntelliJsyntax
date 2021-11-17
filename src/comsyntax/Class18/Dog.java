package comsyntax.Class18;

public class Dog extends Animal{
  void bark(){
      System.out.println(name+" barking"); //name variable is not defined yet
      //if we add the "extends" keyword, then the name variable would be accessible from the Animal Class
  }
}
