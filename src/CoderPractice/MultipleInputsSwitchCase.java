package CoderPractice;

public class MultipleInputsSwitchCase {

	public static void main(String[] args) {
		
		int Mark=28;
		
		if(Mark>=75)
		{
			System.out.println("Distinction");
		}
		
		else if (Mark>60 && Mark<75)
		{
			System.out.println("First Class");
		}
		
		else if (Mark>50 && Mark<60)
		{
			System.out.println("Second Class");
		}
		
		else if (Mark>35 && Mark<50)
		{
			System.out.println("Pass Class");
		}
		
		else
		{
			System.out.println("you are Fail Item");
		}

	}

}
