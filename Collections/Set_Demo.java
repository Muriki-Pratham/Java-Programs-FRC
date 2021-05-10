package Collections;

//Set is collection /interface to add element.It store data unordered and duplicate element are allow set
import java.util.*;  
public class Set_Demo
{  
public static void main(String args[])
{  
//Creating HashSet and adding elements  
HashSet<String> set=new HashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay"); 
set.add("pratham");
set.add("purvi");
set.add("amit");
//Traversing elements of set
Iterator<String> itr=set.iterator();  
//Iteration next element is present or not
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
} 