package Polymorphism;

public class Mrchild extends Methodoverriding 
{
     


       public void marry ()
      {
	System.out.println("Jenifer Lawrence");
      }

	public static void main(String[] args) {
		Mrchild obj=new Mrchild();
		
		obj.property();
		obj.marry();

	}

}
