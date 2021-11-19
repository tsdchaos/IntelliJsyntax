package comsyntax.Class19HW;

public class Shape {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code\
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{
    double area;
    public Circle(double radius){
        super(radius);
    }
    void areaTest(){
        area=(radius*radius)*3.14;
        System.out.println("Area of the circle is: "+area);
    }

    public static void main(String[] args) {
    Circle circle = new Circle(5.6);
        circle.areaTest();
    }
}
