package Arrays;

import java.util.Arrays;

public class Arraydemo {

	public static void main(String[] args) {

		       int a[]= {10,20,30,40};//this is called array.
		       
		       System.out.println(a.length);//to calculate size/length of array.
		       
		       System.out.println(a[2]);//here we print value at index 2.
		       System.out.println(a[0]);//here we print value at index 0.
		     //System.out.println(a[4]);//here we print value at index 4.
		       
		       System.out.println(Arrays.toString(a));//to print entire array.
		       
		       a[1]=88;//for replacing value at index 1.
		       System.out.println(Arrays.toString(a));
		       
		       //second approach..
		       for(int v=0;v<a.length;v++)//no semicolon here.
		       {
		    	   System.out.println(a[v]+"");
		       }
		       System.out.println();
		       
		       //Third approach..
		       for(int k:a)//syntax for(data type new variable:old variable)
		       {
		    	   System.out.println(k);
		       }
		       
		       
		       
		      
		       
	}

}
