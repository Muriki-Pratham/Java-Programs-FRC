package Collections;

import java.util.ArrayList;
import java.util.HashSet;
 
public class HashSetToSetArray 
{
    public static void main(String[] args) 
    {
        HashSet<String> namesSet = new HashSet<>();
         
        namesSet.add("alex");
        namesSet.add("brian");
        namesSet.add("charles");
        namesSet.add("david");
        namesSet.add("Brayden");
        namesSet.add("Pratham");
        namesSet.add("Purvi");
         
        //Pass hashset to arraylist constructor
        ArrayList<String> namesList = new ArrayList<>(namesSet);
         
      
//all elements from hashset are copied to arraylist
        System.out.println(namesList);
    }
}