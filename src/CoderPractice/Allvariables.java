package CoderPractice;

public class Allvariables {

	    static int v=10; //Global variable (Input).
	           int s=20;//instance variable (Input).
	     
	     public void combine() //create a method.
	 	
	     {	int y=26;   //Local variable (Input).
	 		System.out.println(y);//Local variable (output).
	 	
	     }
	     
	    public static void main(String[] args) {
		 
		//creating a object.
       Allvariables var=new  Allvariables();
   
       //calling a class.  
        var.combine();
    
       //SOP statement.    
        System.out.println(var.s); //[object name.variable name] instance variable (Output).
        System.out.println(v);     //Global variable output.
		
	}

}
