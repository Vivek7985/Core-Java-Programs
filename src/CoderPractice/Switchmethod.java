package CoderPractice;

public class Switchmethod {

	public static void main(String[] args) {
		
		int A=0;  
		 
		
		switch (A) //Here only Take integers.
		{
		   case 10: //Colon are compulsory here.
		   {
			   System.out.println("I am 10");
		   }
		   break; //semicolon are compulsory here.
		   
		   case 20:
		   {
			   System.out.println("I am 20");
		   }
			break;
			
		   case 30:
		   {
			   System.out.println("I am 30");
		   }
			break;
			
			default :
			{
				System.out.println("If this code will not Excute no one matches");
			}
			System.out.println("This code belongs to main method");
		} 
	
	}

}
