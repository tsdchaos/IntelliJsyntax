package comsyntax.Class22HW;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
public class Computer {
   int RAM;
   String GPU;
   String OS;
   Computer(String OS, int RAM, String GPU){
           this.OS=OS;
           this.RAM=RAM;
           this.GPU=GPU;
   }
   void displayOS(){
           System.out.println("Computer runs an Operating System");
   }
   void displayGPU(){
           System.out.println("Computer is running a low end NVIDIA card");
   }
}
class Apple extends Computer{
        Apple(String OS, int RAM, String GPU){
             super(OS, RAM, GPU);
        }
   void displayOS(){
           System.out.println("Apple computers run "+OS);
   }
   void displayGPU(){
           System.out.println("Apple computers run a "+GPU);
   }
   void toddlerInt(){
           System.out.println("Apple OS has a GUI usable by toddlers");
   }
}
class Lenovo extends Computer{
        Lenovo(String OS, int RAM, String GPU){
                super(OS, RAM, GPU);
        }
        void displayOS(){
                System.out.println("Lenovo computers run "+OS);
        }
        void displayGPU(){
                System.out.println("Lenovo computers run a "+GPU);
        }
        void midGrade(){
                System.out.println("Lenovo laptops are good mid-grade laptops");
        }
}
class HP extends Computer{
        HP(String OS, int RAM, String GPU){
                super(OS, RAM, GPU);
        }
        void displayOS(){
                System.out.println("HP computers run "+OS);
        }
        void displayGPU(){
                System.out.println("HP computers run a "+GPU);
        }
        void cheap(){
                System.out.println(OS+" has been installed so the user can feel superior");
        }
}
class Dell extends Computer{
        Dell(String OS, int RAM, String GPU){
                super(OS, RAM, GPU);
        }
        void displayOS(){
                System.out.println("Dell computers run "+OS);
        }
        void displayGPU(){
                System.out.println("Dell computers run a "+GPU);
        }
        void neverUpdate(){
                System.out.println("Dell computers are the cheapest of the cheap, and are never upgraded");
        }
}

class ComputerTester{
        public static void main(String[] args) {
                Computer[] computers={new Apple("Mac OS", 32, "High end NVIDIA"), new HP("Linux Ubuntu", 16, "Onboard"), new Lenovo("Windows 10", 32, "Mid-grade Radeon"), new Dell("Windows 98", 4, "Onboard")};
                for(Computer computer2:computers){
                        computer2.displayGPU();
                        computer2.displayOS();
                        if(computer2 instanceof Dell){
                                ((Dell) computer2).neverUpdate();
                        }
                        if(computer2 instanceof HP){
                                ((HP) computer2).cheap();
                        }
                        if(computer2 instanceof Apple){
                                ((Apple) computer2).toddlerInt();
                        }
                        if(computer2 instanceof Lenovo){
                                ((Lenovo) computer2).midGrade();
                        }
                }
        }
}

