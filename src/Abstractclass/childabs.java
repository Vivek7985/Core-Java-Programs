package Abstractclass;

public  class childabs extends Parentabs {
	
	public void M1()//it is mandatory to write body in child class for abstract method.
	{
		System.out.println("i am abstract M1 method in child class");
	}
	
	public void M2()//it is mandatory to write body in child class for abstract method.
	{
		System.out.println("i am abstract M2 method in child class");
	}
	

	public static void main(String[] args) {
		
		childabs obj=new childabs ();
		obj.M1();
		obj.M2();
		obj.M3();
       
	}

}
