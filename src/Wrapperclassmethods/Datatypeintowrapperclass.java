package Wrapperclassmethods;

public class Datatypeintowrapperclass {

	public static void main(String[] args) {

		int i=10;
		
		Integer I=Integer.valueOf(i);
		//to convert primitive into object.
		
		Integer I1=Integer.valueOf(20);
		//2nd approach.
		
		System.out.println(I);
		System.out.println(I1);
		
		char c='a';
		Character C=Character.valueOf(c);
		System.out.println(C);
		
		double d=55.5;
		Double D=Double.valueOf(d);
		System.out.println(D);
		
		boolean b=true;
		Boolean B=Boolean.valueOf(b);
		System.out.println(B);
		
		float f=5.5f;
		Float F=Float.valueOf(f);
		System.out.println(F);
	}

}
