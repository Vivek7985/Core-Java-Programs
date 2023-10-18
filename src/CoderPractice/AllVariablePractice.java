package CoderPractice;

public class AllVariablePractice{ //creating a class.
	
	int M=47; //instance variable.
	public void instVar() //creating a method.
	{
		System.out.println(M); //code of block / statement.
	}
	
	public static void main(String[] args) { //creating a main method.
		
		//creating a object.
		//className new=new className();
		AllVariablePractice Var=new AllVariablePractice();
		
		//calling a method.
		//obejctName.methodName();
		Var.instVar();
	}
}