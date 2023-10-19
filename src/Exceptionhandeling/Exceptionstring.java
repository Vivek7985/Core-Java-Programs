package Exceptionhandeling;

public class Exceptionstring {

	public static void main(String[] args) {
		
		String v="VIVEK";
		
		try {
			System.out.println(v.charAt(5));
		}
		
		catch(Exception e){
			System.out.println("This is word");
		}

	}

}
