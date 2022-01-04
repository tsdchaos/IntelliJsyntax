package comsyntax.RepltTests;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Repl217 {
    /*
    Complete countDuplicates method This method should count how many numbers are appearing more than once and should return the count.

    Input [12,12,13,45,78,7,7] output 2

Input [12,12,7,7,7,7,7] output 2

Input [12,120,13,45,78,17,57] output 0

Input [12,12,13,45,78,67,87] output 1
     */
    public static void main(String[] args ){
        List<Integer> numbers=new LinkedList<>();
        Collections.addAll(numbers, 12,12,13,45,78,7,7);
        System.out.println(countDuplicates(numbers));
        List<Integer> numbers1=new LinkedList<>();
        Collections.addAll(numbers1, 12,12,7,7,7,7,7);
        System.out.println(countDuplicates(numbers1));
        List<Integer> numbers2=new LinkedList<>();
        Collections.addAll(numbers2, 12,120,13,45,78,17,57);
        System.out.println(countDuplicates(numbers2));
        List<Integer> numbers3=new LinkedList<>();
        Collections.addAll(numbers3, 12,12,13,45,78,67,87);
        System.out.println(countDuplicates(numbers3));
    }
    static int countDuplicates(List<Integer> numbers){
        List<Integer> numberList=numbers;
        //Find the largest number in the array
        int maxNum=0;
        for(int i=0; i<numberList.size(); i++){
            if(numberList.get(i) >maxNum){
                maxNum=numberList.get(i);
            }
        }
        //set the number of duplicates
        int dupes=0;
        for(int i=0; i<=maxNum;i++){
            int count=Collections.frequency(numberList, i);
            if(count>1){
                dupes++;
            }
        }
        return dupes;
    }
}
