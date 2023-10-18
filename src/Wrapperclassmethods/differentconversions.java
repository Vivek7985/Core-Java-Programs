package Wrapperclassmethods;

public class differentconversions {

	public static void main(String[] args) {

		int i=10;
		
		//convert primitive to wrapper.
		Integer I=Integer.valueOf(i);
		System.out.println(I.intValue());
		
		//convert primitive to object.
		Character C=Character.valueOf('z');
		System.out.println(C.charValue());
		
		//convert primitive to non-integer.
		Double D=Double.valueOf(20.20);
		System.out.println(D.doubleValue());
	}

}
