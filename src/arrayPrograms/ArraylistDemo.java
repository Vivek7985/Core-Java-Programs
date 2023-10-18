package arrayPrograms;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
          
		ArrayList<Integer> obj=new ArrayList<Integer>();//to declare array list.
		 
		obj.add(10);//to add new value 10.
        obj.add(20);//to add new value 20
		obj.add(30);//to add new value 30.
		obj.add(40);//to add new value 40.
		
		System.out.println(obj);//for printing all arrays.
		
		System.out.println(obj.size());//for calculate size.
		
		System.out.println(obj.get(0));//to retrieve the value at 0 index.
		
		obj.add(60);
		System.out.println(obj);
		
		obj.remove(4);//remove value at index 4.
		System.out.println(obj);
		
		obj.add(3,99);//to insert specific value at specific index.
		
		System.out.println(obj);
		
		obj.set(0, 28);
		System.out.println(obj);
		
      //obj.clear();
		System.out.println(obj);//to remove all the value from array list.
		
		System.out.println(obj.contains(40));//check whether the values are available or not(boolean). 
	
	    //2nd approach
		//for loop.
		
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		//3rd approach. for each loop
		System.out.println('\n');//to print on new line.
		
		for(int k:obj)//syntax for(data type new variable:old variable).
		{
			System.out.println(k+" ");
		}
	}

}
