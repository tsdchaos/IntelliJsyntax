package comsyntax.RepltTests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Repl218 {
    /*
    Count the number of repetations of words in an ArrayList append that count and return that list. You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList
input ["switch","tv","switch","tv","switch","tv"]
output [switch, tv, switch1, tv1, switch2, tv2]
In this example as word switch is repeated we pick the next entry where it is repeated and append the count i.e how many times that word was present previously

More Examples
input ["switch","tv","switch","tv","switch","tv","radio"]
output [switch, tv, switch1, tv1, switch2, tv2, radio]
input ["switch","tv","switch","tv"]
output [switch, tv, switch1, tv1]
if words are not repeated we get the same output
input ["switch","tv"]
output [switch, tv]
     */
    public static void main(String[] args) {
        ArrayList<String> deviceNames=new ArrayList<>();
        Collections.addAll(deviceNames, "switch","tv","switch","tv","switch","tv","radio");
        ArrayList<String> deviceNamesReturned = new ArrayList<>();
        deviceNamesReturned.addAll(countDeviceNames(deviceNames));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        //1. Figure out how many different elements there are in the List
        //2. Count how many times each element appears in the list
        //3. Replace
        return deviceNames;
    }
}
