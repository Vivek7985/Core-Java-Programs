package Exceptionhandeling;

public class A {

	public static void main(String[] args) {

		try{
		System.out.println(10/0);
		}
		
		catch(ArithmeticException v){
			System.out.println("This excption get handelled");
		
		}
		}
	}


