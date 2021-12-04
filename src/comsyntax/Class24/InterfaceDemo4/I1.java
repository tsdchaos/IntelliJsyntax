package comsyntax.Class24.InterfaceDemo4;

public interface I1 {
    void method();
    int age=10;
    static void method2(){
        System.out.println("I am Method2 from Interface1");
    }
}
interface I2{
    int age=20;
    void method();
    static void method2(){
        System.out.println("I am Method2 from Interface2");
    }
}

class Test implements I1, I2{
    @Override
    public void method() {
        System.out.println(I1.age);
        System.out.println("I will be called for both the methods from both interfaces");
    }
}
class Main{
    public static void main(String[] args) {
        I1 i1=new Test();
        i1.method();
        I2 i2=new Test();
        i2.method();
        I1.method2();
        I2.method2();
    }
}