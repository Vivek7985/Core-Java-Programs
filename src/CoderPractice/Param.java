package CoderPractice;

public class Param {
	//access modifier, return type, Method name(Data type Arguments){SOP};
	
	public void vivek(int v,int s)
	{ 
		System.out.println(v+s);
	}
    
	public void vivek(double m,double n)
	{
		System.out.println(m+n);
	}
	
	public void vivek(String v)
	{
		
	   System.out.println("Hello World");
	}
	
	public void v1()
	{
		System.out.println("I am normal method");
	}
	
	public static void main(String[] args) {
		
   //creating an object. class name object name=new class name();
		Param school=new Param();
		
	//calling method. object name.methodname(Data type value)
		school.vivek(10,35);
		
		school.vivek(10.20,20.20);
		
		school.vivek("v");
		
		school.v1();
	}
}
