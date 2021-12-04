package comsyntax.GroupProjectIndividualAssignments;

public abstract class Marks {
    // We have to calculate the average of marks obtained in three subjects by student A and by student B. Create class
    // 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    // Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
    // three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
    abstract void getPercentage();
}
class A extends Marks{
    int subj1;
    int subj2;
    int subj3;
    double average;

    public A(int subj1, int subj2, int subj3) {
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;
        getPercentage();
    }

    @Override
    void getPercentage() {
        average=(subj1+subj2+subj3)/3;
        System.out.println("Student A got an average score of "+average);
    }
}
class B extends Marks{
    int subj1;
    int subj2;
    int subj3;
    int subj4;
    double average;

    public B(int subj1, int subj2, int subj3, int subj4) {
        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;
        this.subj4 = subj4;
        getPercentage();
    }

    @Override
    void getPercentage() {
        average=(subj1+subj2+subj3+subj4)/4;
        System.out.println("Student B got an average score of "+average);
    }
}
class Tester{
    public static void main(String[] args) {
        Marks studentA=new A(87, 95, 90);
        Marks studentB=new B(67, 79, 85, 73);
    }
}