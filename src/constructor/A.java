package constructor;

public class A {
	
	 public void A()//default constructor.(no arg constructor)
	{
		System.out.println("THis is no arg");
	}
    
	public void A(int x,int y)//parameterized constructor(arg. constructor)
    {
    	System.out.println(x+y);
    }
    
	public void A(int x,int y,int Z)
	{
		System.out.println(x+y+Z);
	}
	
	public void A(double x)
	{
		System.out.println(x);
	}
	
	
     public static void main(String[] args) {
	     
    	 A obj=new A ();
	     
	      obj.A();
	      obj.A(20,25);
	      obj.A(30,35,42);
	      obj.A();
	      obj.A('m','n');//automation promotion takes place here.
          obj.A(10);    //automation promotion takes place here.
     }

		
}




