package Polymorphism;

public class Methodoverloading {

	public void add()
	{
		System.out.println("This is no argument method.");
	}	
	
	public void add(int x)
	{
		System.out.println("This is argument method");
	}
	
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		
       Methodoverloading obj=new Methodoverloading();
       
               obj.add();
               obj.add('x');
               obj.add(10,20);
               obj.add('a','b');//automation promotion takes place here 
            // obj.add (20.2);   
		
		

	}

}
