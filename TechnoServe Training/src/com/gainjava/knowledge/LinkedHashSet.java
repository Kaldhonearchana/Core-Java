package com.gainjava.knowledge;

import java.util.*; 

public class LinkedHashSet{  
 private static String Training;

 
public static void main(String args[]){  
 
TreeSet<String> hs=new TreeSet<String>();
 hs.add("Techno");
 hs.add("Serve");
 
 Iterator i=hs.iterator();
 while(i.hasNext())
 {
	 Object o=i.next();
	 System.out.println(o);  
  }  
 }  
}  
