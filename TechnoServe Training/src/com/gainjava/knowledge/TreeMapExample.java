package com.gainjava.knowledge;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample
{  
 public static void main(String args[])
 {  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
      //map.put(null, "Savior");
     map.put(105, null);
        
      for(Entry<Integer, String> m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}