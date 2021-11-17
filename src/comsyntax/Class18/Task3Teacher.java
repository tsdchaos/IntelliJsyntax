package comsyntax.Class18;

public class Task3Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
    // ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
    String position;
    static String school="Made Up High School";
    String name;
    int pay;
    void teachPay(){
        System.out.println(name+" gets paid "+pay+" a year for their job as a "+position+" at "+school);
    }
}
