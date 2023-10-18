package Hashset;

import java.util.HashSet;

public class hashsetdouble {

	public static void main(String[] args) {

		HashSet<Double> obj=new HashSet<Double>();
		
		obj.add(10.20);
		obj.add(20.30);
		obj.add(30.40);
		obj.add(40.50);
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		obj.remove(10.20);
		System.out.println(obj);
		
		obj.add(50.60);
		System.out.println(obj);
		
		System.out.println(obj.contains(50.60));
		
		//2nd approach to print set.
		//for each loop
		for (double v:obj)
		{
			System.out.println(v);
		}
		
	}

}
