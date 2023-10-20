package Wrapperclassmethods;

public class ConversionofString {

	public static void main(String[] args) {
          
		String date="28";
		
		//conversion string to integer.
		//ParseInt convert string into primitive.
		
		int i=Integer.parseInt(date);
		System.out.println(i);
		
		//conversion string to double.
		double d=Double.parseDouble(date);
		System.out.println(d);
		
		String s="100";
		
		//conversion string to integer.
		int i1=Integer.parseInt(s);
		
		//conversion string to byte.
		byte b=Byte.parseByte(s);
		System.out.println(b);
		
	}

}
