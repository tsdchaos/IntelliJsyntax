package comsyntax.Class28;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer> fruit=new HashMap<>(); //The first data type is called the "Key", the second data type is the value
        fruit.put("Apple", 10);
        fruit.put("Orange", 4);
        fruit.put("Kiwi", 6);
        fruit.put("Mango", 12);
        fruit.put("Apricot", 20); //Instead of add method, we use the put method to add keys and values to the map
        System.out.println(fruit.get("Kiwi")); //use get method to use the Key you want, to get the value of the key
        //The key is case sensitive
        fruit.replace("Mango", 22);
        System.out.println(fruit.remove("Orange"));
        //removing the key also removes the value.
        System.out.println(fruit);
        System.out.println(fruit.containsKey(("cow"))); //can use containsKey method to check for keys. containsValue is used in similar function
        System.out.println(fruit.containsValue(100));
        System.out.println(fruit.isEmpty()); //exactly what you think
        System.out.println(fruit.replace("Mango", 35)); //You can repalce the value of a key with the replace method
        System.out.println(fruit);
    }
}
