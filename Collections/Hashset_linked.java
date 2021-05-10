package Collections;


import java.util.*;  
public class Hashset_linked
{  
public static void main(String args[])
{  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");
set.add("pratham");
set.add("purvi");
set.add("amit");
set.add("null");
set.add("bradaon");
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}