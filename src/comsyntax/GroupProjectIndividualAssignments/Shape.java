package comsyntax.GroupProjectIndividualAssignments;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    double radius;
    double perimeter;
    double area;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea() {
        area=radius*radius*(Math.PI);
        System.out.println("The area of the circle is: "+area);
    }

    @Override
    public void calculatePerimeter() {
        perimeter=radius*2*(Math.PI);
        System.out.println("Perimeter of the circle is: "+perimeter);
    }
}
class Square implements Shape{
    double side;
    double area;
    double perimeter;

    Square(double side){
        this.side=side;
    }
    @Override
    public void calculatePerimeter() {
        perimeter=side*4;
        System.out.println("The perimeter of the square is: "+perimeter);
    }

    @Override
    public void calculateArea() {
        area=side*side;
        System.out.println("The area of the square is: "+area);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape[] shapes={new Circle(5.7), new Square(6.7)};
        for(Shape s:shapes){
            s.calculateArea();
            s.calculatePerimeter();
        }
    }
}