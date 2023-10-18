package Hashset;

import java.util.HashSet;

public class hashsetdemo {

	public static void main(String[] args) {

	 HashSet<Integer> obj=new HashSet<Integer>();//to declare the hash set.
	  
	 obj.add(10);
	 obj.add(20);
	 obj.add(30);
	 obj.add(40);
	 obj.add(30);//same values cant be print.
	 
	 System.out.println(obj);//to calculate length.
	 
	 System.out.println(obj.size());//to calculate length.
	 
	 //obj.get(0);//not applicable bcoz the concept of index value is not applicable here.
	 
	 obj.remove(10);
	 System.out.println(obj);
	 
	 obj.add(99);
	 System.out.println(obj);//add value randomely.
	 
   //obj.clear();
	 System.out.println(obj);//applicable here.
	 
	 System.out.println(obj.contains(20));//working here.
	 
	 //2nd approach to print set.
	 //for each loop 
	   for (int k:obj)
	   {
		   System.out.println(k);
	   }
	   }
	}


