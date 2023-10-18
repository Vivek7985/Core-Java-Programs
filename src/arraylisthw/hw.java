package arraylisthw;

import java.util.ArrayList;

public class hw {

	public static void main(String[] args) {
       
		ArrayList<String> milkyway=new ArrayList<String>();
		
		milkyway.add("Earth");
		milkyway.add("Moon");
		milkyway.add("Mars");
		milkyway.add("Jupiter");
		milkyway.add("Neptune");
		
		System.out.println(milkyway);//all
		System.out.println(milkyway.size());//length
		System.out.println(milkyway.get(0));//retrieve value at index 0.
		
		milkyway.add("Saturn");//adding SATURN.
		System.out.println(milkyway);
		
		milkyway.remove(5);//remove string at index 5.
		System.out.println(milkyway);
		
		milkyway.add(2,"Saturn");//change SATURN to index 2.
		System.out.println(milkyway);
		
		milkyway.add(3,"Mercury");//Change Mercury to index 3.
		System.out.println(milkyway);
		
      //milkyway.clear();//removing all elements from array.
		System.out.println(milkyway);
		
		System.out.println(milkyway.contains("Mercury"));
		
		// 2nd approach for loop.
		for (int s=0; s<milkyway.size(); s++)
		{
			System.out.println(milkyway.get(s));
		}
		
		//3rd approach for each loop.
		System.out.println('\n');//to print on new line.
		
		for(String s:milkyway)//syntax for each loop .for(data type new variable:old variable).
			System.out.println(s+" ");
		
	}

}
