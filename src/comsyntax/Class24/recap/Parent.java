package comsyntax.Class24.recap;

public abstract class Parent {
    abstract void method1();
    abstract void method2();
}
abstract class Child extends Parent{ //as long as the child class is abstract as well, we don't need to implement all of the abstract methods
    @Override
    void method1() {
        System.out.println("Method 1 in Child");
    }
}
class GrandChild extends Child{
    @Override
    void method2() {
        System.out.println("Method 2 from GrandChild");
    }
}
class Tester{
    public static void main(String[] args) {
        GrandChild child=new GrandChild();
        child.method1();
        child.method2();
    }
}