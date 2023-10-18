package autoboxingunboxing;

public class Typeclasses {

	public static void main(String[] args) {

		int i=10;
		
		Integer I=i; //autoboxing.
		//here value of method taken by java automatically.
		
		//Unboxing.
		Double D=Double.valueOf(10.10);
		
		double d=D;
		//here ...xxxValue method is internally used by java compilor.
	}

}
