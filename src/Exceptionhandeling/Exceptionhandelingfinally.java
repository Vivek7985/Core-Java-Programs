package Exceptionhandeling;

public class Exceptionhandelingfinally {

	public static void main(String[] args) {
		
		try {
		System.out.println(10/0);
		}
		
		catch(Exception v){
			System.out.println("This is Exception Handeling");
		}
         
		finally{
			System.out.println("THis is finally.");
		}
	}

}
