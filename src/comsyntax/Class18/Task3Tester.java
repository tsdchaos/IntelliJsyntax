package comsyntax.Class18;

public class Task3Tester {
    public static void main(String[] args) {
        Task3MathTeacher math=new Task3MathTeacher();
        Task3ChemTeacher chem=new Task3ChemTeacher();
        Task3PianoTeacher piano=new Task3PianoTeacher();
        math.name="John";
        piano.name="Jane";
        chem.name="Bob";
        math.pay=85000;
        piano.pay=50000;
        chem.pay=100000;
        math.position="math teacher";
        chem.position="chemistry teacher";
        piano.position="piano teacher";
        math.teachMath();
        piano.teachPiano();
        chem.teachChem();
        math.teachPay();
        chem.teachPay();
        piano.teachPay();
    }
}
