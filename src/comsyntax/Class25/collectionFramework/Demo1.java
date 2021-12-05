package comsyntax.Class25.collectionFramework;

import java.util.ArrayList;

public class Demo1 {
    /* limitation of arrays
    1) Arrays are fixed in size

     */

    public static void main(String[] args) {
        String name="Hasim";
        String name2="Ahmet";
        String[] names={"Maryum", "Amran"};
        //names[2]="Mohammad"; //can't add more than 2 elements
        //In order to add more variables to the array, it is a lot of work to do. Especially if you don't know the size
        //of the array in advance

        ArrayList<String> listOfNames=new ArrayList<>();
        //the data type is specified inside the <>
        System.out.println("Size of listOfNames "+listOfNames.size());
        //size is currently 0
        listOfNames.add("alan");
        System.out.println("Size of listOfNames "+listOfNames.size()); //size is now 1
        listOfNames.add("Aysha");
        listOfNames.add("Tamana");
        System.out.println("Size of listOfNames "+listOfNames.size()); //size is now 3
        listOfNames.remove("Aysha");
        System.out.println("Size of listOfNames "+listOfNames.size()); //size is now 2

    }
}
