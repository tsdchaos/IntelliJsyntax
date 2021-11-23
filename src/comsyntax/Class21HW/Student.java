package comsyntax.Class21HW;

public class Student {
 /*   Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
            Define some methods specific to child classes
            Write example of achieving run time polymorphism
 */
    void doHomework(){
        System.out.println("Complete your homework");
    }
    void attendClass(){
        System.out.println("Attend class");
    }
    void takeTest(){
        System.out.println("Take test");
    }

}
class SyntaxStudent extends Student{
    @Override
    void doHomework(){
        System.out.println("Complete your Java homework");
    }
    @Override
    void attendClass(){
        System.out.println("Attend Java and Selenium class");
    }
    void writeCode(){
        System.out.println("Write programs using Java");
    }
}
class CollegeStudent extends Student{
    @Override
    void doHomework(){
        System.out.println("Complete your college level homework");
    }
    @Override
    void attendClass(){
        System.out.println("Attend lectures and small group classes");
    }
    void intern(){
        System.out.println("Apply for internships");
    }
}
class SchoolStudent extends Student{
    @Override
    void doHomework(){
        System.out.println("Complete your homework for Math and English");
    }
    @Override
    void attendClass(){
        System.out.println("Attend class every day");
    }
    void applyCollege(){
        System.out.println("Apply for college in your senior year");
    }
}